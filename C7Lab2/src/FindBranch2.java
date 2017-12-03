/*
 *   クラス名        ：FindBranch2
 *   ソースファイル名：FindBranch2.java
 *   著作権表示      ：Copyright 2015 Fujitsu Kyushu Systems Limited
 */

import java.sql.*;

// 支店・配送車検索クラス
public class FindBranch2 {

    public static void main(String args[]) {
    	
        // ドライバクラス
        String driver = "com.mysql.jdbc.Driver";
        // データベースのURL
        String url    = "jdbc:mysql://localhost:3306/fjqs_DB";
		// データベースのユーザ
		String  user  = "root";
		// パスワード
		String  pass  = "password";
        
        Connection         con   = null;      // コネクション
        PreparedStatement  stmt1 = null;      // ステートメント（支店用）
        PreparedStatement  stmt2 = null;      // ステートメント（配送車用）
        ResultSet          res1  = null;      // 結果セット（支店用）
        ResultSet          res2  = null;      // 結果セット（配送車用）
        
        String code = "";            		  //支店コード
        if(args.length == 1) {
            code = args[0];
        }
        else {
            System.out.println("支店コードを指定してください");
            System.exit(-1);
        }

        // 必要なデータベースアクセス処理を記述してください。
    	
    }
}