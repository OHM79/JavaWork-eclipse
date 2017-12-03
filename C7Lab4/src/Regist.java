/*
 *   クラス名        ：Regist
 *   ソースファイル名：Regist.java
 *   著作権表示      ：Copyright 2015 Fujitsu Kyushu Systems Limited
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;

public class Regist {

    public static void main(String args[]) {
    	
        // ドライバクラス
        String driver  = "com.mysql.jdbc.Driver";
        // データベースのURL
        String url     = "jdbc:mysql://localhost:3306/fjqs_DB";
		// データベースのユーザ
		String  user   = "root";
		// パスワード
		String  pass   = "password";
        
        Connection 			con = null;      // コネクション
        PreparedStatement  stmt = null;      // ステートメント
        ResultSet  			res = null;      // 結果セット
        
        // 日付情報
        Calendar cal = Calendar.getInstance();
        java.sql.Date date
        	= new java.sql.Date(cal.getTime().getTime());
        
        // 支店情報
        String code       = "";             // 支店コード
        int    total      =  0;				// 未配達総数
        
        // 配送車情報
        String areaCode   = "";             // 地区コード
        int    undelivery =  0;				// 配送車状態
        
        // 配達情報
        int    orderNo  =  1;				// 番号
        String sName    = "";				// 差出人名前
        String sAddress = "";				// 差出人住所
        String rName    = "";				// 受取人名前
        String rAddress = "";				// 受取人住所
        java.sql.Date orderDate = date;
        
        if(args.length == 5) {
            areaCode = args[0];
            sName    = args[1];
            sAddress = args[2];
            rName    = args[3];
            rAddress = args[4];
        }
        else {
        	System.out.println("地区コード、差出人氏名、差出人住所、"
            	       + "受取人氏名、受取人住所を指定してください");
            System.exit(-1);
        }

		// 必要なデータベースアクセス処理を記述してください。
  
    }
}
