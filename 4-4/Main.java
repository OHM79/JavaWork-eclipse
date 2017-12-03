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
import com.fjqs.java.labs.chap4.AccountDetail;
import com.fjqs.java.labs.chap4.ConnectionManager;

public class Main {

    public static void main(String args[]) {
        
        Account account = null;     // 指定顧客
        Connection  con = null;
        
        try {
            // コネクション取得
            ConnectionManager cm = ConnectionManager.getInstance();
            con = cm.getConnection();

            // データベース検索処理
            AccountDAO aDao = new AccountDAO(con);

            if(args.length==1) {    // 指定顧客検索
                account  = aDao.findAccountWithDetail(args[0]);
            } else {
                System.out.println("口座番号を入力してください");
                System.exit(1);
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
        if(args.length==1) {
            System.out.println("指定顧客表示");
            System.out.println("=========================================================");
            System.out.println("口座番号\tパスワード\t顧客名\t\t買付余力");
            System.out.println("=========================================================");
            if(account!=null){
                System.out.print(account.getAccountNo() + "\t\t");
                System.out.print(account.getPassword() + "\t\t");
                System.out.print(account.getCustomerName() + "\t");
                System.out.println(account.getBalance());
                System.out.println();

                ArrayList<AccountDetail> details = account.getDetails();
                if (details.size() != 0) {
                    Iterator<AccountDetail> it = details.iterator();
                    System.out.println("口座明細一覧");
                    System.out.println("=========================================================");
                    System.out.println("口座番号\t銘柄番号\t保有株数\t買付額");
                    System.out.println("=========================================================");
                    while (it.hasNext()) {
                        AccountDetail ad = it.next();
                        System.out.print(ad.getAccountNo() + "\t\t");
                        System.out.print(ad.getBrandNo() + "\t\t");
                        System.out.print(ad.getEquityHoldings() + "\t\t");
                        System.out.println(ad.getPurchaseAmount());
                    }
                }else{
                    System.out.print("口座明細が存在しません。");
                }
            }else{
                System.out.print("該当レコードが存在しません。");
            }
        }
        System.out.println();
    }
}
