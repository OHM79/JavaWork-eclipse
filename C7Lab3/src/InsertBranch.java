/*
 *   クラス名        ：InsertBranch
 *   ソースファイル名：InsertBranch.java
 *   著作権表示      ：Copyright 2015 Fujitsu Kyushu Systems Limited
 */

import com.fjqs.java.labs.chap7.UserException;
import java.sql.*;

public class InsertBranch {

    public static void main(String args[]) {
    	
        // ドライバクラス
        String driver = "com.mysql.jdbc.Driver";
        // データベースのURL
        String url    = "jdbc:mysql://localhost:3306/fjqs_DB";
        // データベースのユーザ
		String  user  = "root";
		// パスワード
		String  pass  = "password";

        Connection         con = null;      // コネクション
        PreparedStatement stmt = null;      // ステートメント
        ResultSet          res = null;      // 結果セット

        // 支店情報
        String branchCode  = "";    		// 支店コード
		String address     = "";			// 住所
        String tel         = "";    		// 電話番号 
        int    total       =  0;    		// 未配達総数
 
    	// コマンドラインからパラメタを取得
        if(args.length == 3) {
	    	branchCode    = args[0];
            address       = args[1];
            tel           = args[2];
		}
        else {
            System.out.println("支店コード、住所、電話番号を入力してください");
            System.exit(-1);
        }

       // 必要なデータベースアクセス処理を記述してください。
    	
    }
}
