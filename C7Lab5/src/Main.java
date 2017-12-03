/*
 *   クラス名        ：Main
 *   ソースファイル名：Main.java
 *   著作権表示      ：Copyright 2015 Fujitsu Kyushu Systems Limited
 */

import com.fjqs.java.labs.chap7.UserException;
import com.fjqs.java.labs.chap7.DBAccess;

import java.sql.*;
import java.util.*;

// メインクラス
public class Main {

    public static void main(String args[]) {

		// ドライバマネージャクラス
		String DRIVER = "com.mysql.jdbc.Driver";
		// データベースのURL
		String URL    = "jdbc:mysql://localhost:3306/fjqs_DB";
		// データベースのユーザ
		String  user  = "root";
		// パスワード
		String  pass  = "password";
	
		Connection con = null;
    	DBAccess   dba = null;		// データベース操作
    	
    	String code  	  = "";		// 支店コード
    	String aCode 	  = "";		// 地区コード
    	int    orderNo    = 0;		// 伝票番号
    	
    	HashMap branch   = null;	// 支店情報
    	HashMap van      = null;	// 配送車情報
    	HashMap delivery = null;	// 配達情報
    	
        if(args.length == 1) {
        	try {
	            orderNo =Integer.parseInt(args[0]);
	        }
	        catch(NumberFormatException e) {
	        	System.out.println("伝票番号は数字を"
	        					 + "指定してください");
	        	System.exit(-1);
	        }
        }
        else {
            System.out.println("伝票番号を指定してください");
            System.exit(-1);
        }

		// 必要なデータベースアクセス処理を記述してください。
        
    }
}
