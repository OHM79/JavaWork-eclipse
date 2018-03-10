
/*
 *   クラス名        ：Regist
 *   ソースファイル名：Regist.java
 *   著作権表示      ：Copyright 2015 Fujitsu Kyushu Systems Limited
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;

import com.fjqs.java.labs.chap7.UserException;

public class Regist {

	public static void main(String args[]) {

		// ドライバクラス
		String driver = "com.mysql.jdbc.Driver";
		// データベースのURL
		String url = "jdbc:mysql://localhost:3306/fjqs_DB";
		// データベースのユーザ
		String user = "root";
		// パスワード
		String pass = "password";

		Connection con = null;      // コネクション
		PreparedStatement stmt = null;      // ステートメント
		ResultSet res = null;      // 結果セット

		// 日付情報
		Calendar cal = Calendar.getInstance();
		java.sql.Date date = new java.sql.Date(cal.getTime().getTime());

		// 支店情報
		String code = "";             // 支店コード
		int total = 0;				// 未配達総数

		// 配送車情報
		String areaCode = "";             // 地区コード
		int undelivery = 0;				// 配送車状態

		// 配達情報
		int orderNo = 1;				// 番号
		String sName = "";				// 差出人名前
		String sAddress = "";				// 差出人住所
		String rName = "";				// 受取人名前
		String rAddress = "";				// 受取人住所
		java.sql.Date orderDate = date;

		if (args.length == 5) {
			areaCode = args[0];
			sName = args[1];
			sAddress = args[2];
			rName = args[3];
			rAddress = args[4];
		} else {
			System.out.println("地区コード、差出人氏名、差出人住所、"
					+ "受取人氏名、受取人住所を指定してください");
			System.exit(-1);
		}

		try {
			// ドライバのロード
			Class.forName(driver);

			// コネクションの取得
			con = DriverManager.getConnection(url, user, pass);

			// オートコミット解除
			con.setAutoCommit(false);

			String getDelivery_van = "select * from delivery_van Where AREACODE = ?;";

			// 配送車テーブルから情報取得
			stmt = con.prepareStatement(getDelivery_van);
			stmt.setString(1, areaCode);
			res = stmt.executeQuery();
			String targetCode;		// 取得した配送社の支店コード
			int targetUndelivery;	// 配送車の未配達数
			if (res.next()) {
				targetCode = res.getString("CODE");
				targetUndelivery = res.getInt("UNDELIVERY");
				targetUndelivery++; // 配送車の配達数増加のために加算
			} else {
				String msg = "入力された地区コードに対応する情報が見つかりませんでした。";
				throw new UserException(msg);
			}

			// 支店テーブルから支店コードと一致するものを取得
			String getBranchSql = "select * from branch Where CODE = ?;";
			// 支店テーブルから情報取得
			stmt = con.prepareStatement(getBranchSql);
			stmt.setString(1, targetCode);
			res = stmt.executeQuery();

			int branchUndeliveryTotal;
			if (res.next()) {
				branchUndeliveryTotal = res.getInt("TOTAL");
				branchUndeliveryTotal++; // 支店ごとの未配達数増加のために加算
			} else {
				String msg = "入力された支店コードのものが取得出来ませんでした。";
				throw new UserException(msg);
			}

			// 配達テーブルに何件の数があるか調べる
			String getDeliverysSql = "select count(*) as DeliverCount  from deliverys";
			stmt = con.prepareStatement(getDeliverysSql);
			res = stmt.executeQuery();

			int DeliverCount;
			if (res.next()) {
				DeliverCount = res.getInt("DeliverCount");
				DeliverCount++; // 新しい配達情報の受注番号のために加算
			} else {
				String msg = "配達件数の合計が取得できませんでした。";
				throw new UserException(msg);
			}

			// 配達テーブルに新規配達情報を追加
			String insertBranchSql = "Insert Into deliverys Values(?,?,?,?,?,?,?,?,?)";
			stmt = con.prepareStatement(insertBranchSql);
			stmt.setInt(1, DeliverCount);
			stmt.setString(2, areaCode);
			stmt.setString(3, sName);
			stmt.setString(4, sAddress);
			stmt.setString(5, rName);
			stmt.setString(6, rAddress);
			stmt.setDate(7, orderDate);
			stmt.setString(8, null);
			stmt.setInt(9, 0);

			// 新規配達情報の追加
			int num = stmt.executeUpdate();
			if (num == 0) {
				String msg = "配達情報の新規追加に失敗しました";
				throw new UserException(msg);
			}

			// 配送車テーブルの未配達件数の加算
			String updateVanSql = "Update delivery_van Set UNDELIVERY =? where AREACODE = ? ";
			stmt = con.prepareStatement(updateVanSql);
			stmt.setInt(1, targetUndelivery);
			stmt.setString(2, areaCode);

			int num2 = stmt.executeUpdate();
			if (num2 == 0) {
				String msg = "配送車のテーブルの未配達数の加算に失敗しました";
				throw new UserException(msg);
			}

			// 配送車テーブルの未配達件数の加算
			String updateBranchSql = "Update branch Set TOTAL =? where CODE = ? ";
			stmt = con.prepareStatement(updateBranchSql);
			stmt.setInt(1, branchUndeliveryTotal);
			stmt.setString(2, targetCode);

			int num3 = stmt.executeUpdate();
			if (num3 == 0) {
				String msg = "配達情報の新規追加に失敗しました";
				throw new UserException(msg);
			}

			// トランザクションをコミットする
			con.commit();
			System.out.println("配達情報が新規に作成されました。");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			try {
				con.rollback();		// トランザクションをロールバックする
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
			e.printStackTrace();
		} catch (UserException e) {
			try {
				con.rollback();		// トランザクションをロールバックする
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
			System.out.println(e.getMessage());
		} finally {
			try {
				if (res != null) {
					res.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
