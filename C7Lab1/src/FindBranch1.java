/*
 *   クラス名        ：FindBranch1
 *   ソースファイル名：FindBranch1.java
 *   著作権表示      ：Copyright 2015 Fujitsu Kyushu Systems Limited
 */

import java.sql.*;

// 支店情報検索クラス
public class FindBranch1 {

    public static void main(String args[]) {
    	
        // ドライバクラス
        String driver = "com.mysql.jdbc.Driver";
        // データベースのURL
        String url    = "jdbc:mysql://localhost:3306/fjqs_DB";
		// データベースのユーザ
		String  user  = "root";
		// パスワード
		String  pass  = "password";
        
        Connection con = null;               // コネクション
        Statement stmt = null;     			 // ステートメント
        ResultSet  res = null;               // 結果セット
        
        String code = "";            		 //支店コード
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
