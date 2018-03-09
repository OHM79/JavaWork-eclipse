
/*
 *   クラス名        ：FindBranch2
 *   ソースファイル名：FindBranch2.java
 *   著作権表示      ：Copyright 2015 Fujitsu Kyushu Systems Limited
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// 支店・配送車検索クラス
public class FindBranch2 {

	public static void main(String args[]) {

		// ドライバクラス
		String driver = "com.mysql.jdbc.Driver";
		// データベースのURL
		String url = "jdbc:mysql://localhost:3306/fjqs_DB";
		// データベースのユーザ
		String user = "root";
		// パスワード
		// String pass = "password";
		String pass = "11yatuyorosi9";

		Connection con = null; // コネクション
		PreparedStatement stmt1 = null; // ステートメント（支店用）
		PreparedStatement stmt2 = null; // ステートメント（配送車用）
		ResultSet res1 = null; // 結果セット（支店用）
		ResultSet res2 = null; // 結果セット（配送車用）

		String code = ""; // 支店コード
		if (args.length == 1) {
			code = args[0];
		} else {
			System.out.println("支店コードを指定してください");
			System.exit(-1);
		}

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, pass);
			String sql = "select * from BRANCH as bra Where bra.CODE = ?;";
			stmt1 = con.prepareStatement(sql);
			stmt1.setString(1, code);
			res1 = stmt1.executeQuery();

			if (res1.next()) {
				String cod = res1.getString("CODE");
				String address = res1.getString("ADDRESS");
				String tel = res1.getString("TEL");
				String TOTAL = res1.getString("TOTAL");

				System.out.println("--------支店情報----------");
				System.out.println("支店コード		: " + cod);
				System.out.println("住所			: " + address);
				System.out.println("電話番号		: " + tel);
				System.out.println("未配達総数		: " + TOTAL);
				try {
					sql = "SELECT * FROM delivery_van WHERE CODE = ?;";
					stmt2 = con.prepareStatement(sql);
					stmt2.setString(1, code);
					res2 = stmt2.executeQuery();

					System.out.println("\n--------配送車情報----------");
					System.out.println("支店コード	地区コード	未配達荷物");
					while (res2.next()) {
						String vanCod = res2.getString("CODE");
						String vanAddress = res2.getString("AREACODE");
						String uni = res2.getString("UNDELIVERY");
						System.out.printf("%s		%s		%s\n", vanCod, vanAddress, uni);
					}
				} catch (Exception e) {
					System.out.println(e);
				}
			} else {
				System.out.println("支店コード '" + code + "' に対応する情報は見つかりませんでした。");
			}

		} catch (SQLException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}