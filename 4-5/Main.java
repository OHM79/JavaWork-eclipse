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
import com.fjqs.java.labs.chap4.AccountDetailDAO;
import com.fjqs.java.labs.chap4.Brand;
import com.fjqs.java.labs.chap4.BrandDAO;
import com.fjqs.java.labs.chap4.ConnectionManager;

public class Main {

    public static void main(String args[]) {
        Brand   brand   = null;         // 購入銘柄
        Account account = null;         // 指定顧客
        int     equity  = 0;            // 購入株数
        int     amount  = 0;            // 購入金額
        
        Connection con = null;
        
        if(args.length!=3){
            System.out.println("口座番号、銘柄番号、購入株数を入力してください");
            System.exit(1);
        } else {
            try {
                equity = Integer.parseInt(args[2]);
            } catch (NumberFormatException ex) {
                System.out.println("購入株数には0より大きい整数を入力してください");
                System.exit(1);
            }
        }
        // 以下に必要な処理を記述してください。
    
    }
    
    // 指定顧客表示（このメソッドは自由に使用してよい。）
    public static void printAccount(Connection con, String accountNo) throws SQLException {
        
        Account account  = null;            // 指定顧客
        
        // データベース検索処理
        AccountDAO aDao = new AccountDAO(con);
        account = aDao.findAccountWithDetail(accountNo);
        
        //表示処理
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
            System.out.print("該当口座が存在しません。");
        }
        System.out.println();
    }
}
