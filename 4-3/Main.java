/*
    クラス名        ：Main
    ソースファイル名：Main.java
    著作権表示      ：Copyright 2013 Fujitsu Kyushu Systems Limited
*/

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import com.fjqs.java.labs.chap4.Account;
import com.fjqs.java.labs.chap4.AccountDAO;
import com.fjqs.java.labs.chap4.ConnectionManager;

public class Main {

    public static void main(String args[]) {
        
        ArrayList<Account> accounts = null;         // 顧客一覧
        Account            account  = null;         // 指定顧客
        
        Connection con = null;
        
        try {
            // コネクション取得
            ConnectionManager cm = ConnectionManager.getInstance();
            con = cm.getConnection();

            // データベース検索処理
            AccountDAO aDao = new AccountDAO(con);

            if(args.length==0) {    // 顧客一覧検索
                accounts = aDao.findAll();
            }else {                 // 指定顧客検索
                account  = aDao.findAccount(args[0]);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        //表示処理
        if(args.length==0) { 
            Iterator<Account> it = accounts.iterator();
            System.out.println("顧客一覧");
            System.out.println("=========================================================");
            System.out.println("口座番号\tパスワード\t顧客名\t\t買付余力");
            System.out.println("=========================================================");
            while (it.hasNext()) {
                Account ac = it.next();
                System.out.print(ac.getAccountNo() + "\t\t");
                System.out.print(ac.getPassword() + "\t\t");
                System.out.print(ac.getCustomerName() + "\t");
                System.out.println(ac.getBalance());
            }
            System.out.println();
        } else {
            System.out.println("指定顧客表示");
            System.out.println("=========================================================");
            System.out.println("口座番号\tパスワード\t顧客名\t\t買付余力");
            System.out.println("=========================================================");
            if(account!=null){
                System.out.print(account.getAccountNo() + "\t\t");
                System.out.print(account.getPassword() + "\t\t");
                System.out.print(account.getCustomerName() + "\t");
                System.out.println(account.getBalance());
            }else{
                System.out.print("該当レコードが存在しません。");
            }
        }
        System.out.println();
    }
}
