/*
 *   クラス名        ：InsertBranch
 *   ソースファイル名：InsertBranch.java
 *   著作権表示      ：Copyright 2015 Fujitsu Kyushu Systems Limited
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.fjqs.java.labs.chap7.UserException;

public class InsertBranch {

	public static void main(String args[]) {

		// ドライバクラス
		String driver = "com.mysql.jdbc.Driver";
		// データベースのURL
		String url = "jdbc:mysql://localhost:3306/fjqs_DB";
		// データベースのユーザ
		String  user  = "root";
		// パスワード
		String  pass  = "password";

		Connection con = null;      // コネクション
		PreparedStatement stmt = null;      // ステートメント
		ResultSet res = null;      // 結果セット

		// 支店情報
		String branchCode = "";    		// 支店コード
		String address     = "";			// 住所
		String tel = "";    		// 電話番号
		int total = 0;    		// 未配達総数

		// コマンドラインからパラメタを取得
		if (args.length == 3) {
			branchCode = args[0];
			address = args[1];
			tel = args[2];
		} else {
			System.out.println("支店コード、住所、電話番号を入力してください");
			System.exit(-1);
		}

		try {
			// ドライバのロード
			Class.forName(driver);

			// コネクションの取得
			con = DriverManager.getConnection(url, user, pass);

			// オートコミット解除
			con.setAutoCommit(false);

			String getBranchSql = "select * from branch;";

			// 支店テーブルから情報取得
			stmt = con.prepareStatement(getBranchSql);
			res = stmt.executeQuery();

			while (res.next()) {
				String getCode = res.getString("CODE");
				if (getCode.equals(branchCode)) {
					String msg = "入力された支店コードは既に登録されています。";
					throw new UserException(msg);
				}
			}

			String insertBranchSql = "Insert Into branch Values(?, ?, ?, ?)";
			// 支店テーブルへ挿入
			stmt = con.prepareStatement(insertBranchSql);
			stmt.setString(1, branchCode);
			stmt.setString(2, address);
			stmt.setString(3, tel);
			stmt.setInt(4, 0);

			// 新規受注の追加
			int num = stmt.executeUpdate();

			if (num == 0) {
				String msg = "支店の新規追加に失敗しました";
				throw new UserException(msg);
			}

			// トランザクションをコミットする
			con.commit();

			System.out.println("支店情報が登録されました。");
			System.out.println("--------支店情報----------");
			System.out.println("支店コード		: " + branchCode);
			System.out.println("住所			: " + address);
			System.out.println("電話番号		: " + tel);
			System.out.println("未配達総数		: " + 0); // 新規のため未配達は0
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
