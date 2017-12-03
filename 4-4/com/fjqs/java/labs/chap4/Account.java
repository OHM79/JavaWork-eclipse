/*
    クラス名        ：Account
    ソースファイル名：Account.java
    著作権表示      ：Copyright 2013 Fujitsu Kyushu Systems Limited
*/

package com.fjqs.java.labs.chap4;

import java.util.ArrayList;

public class Account {

    private String accountNo;       // 口座番号
    private String password;        // パスワード
    private String customerName;    // 顧客名
    private int    balance;         // 買付余力
    
    private ArrayList<AccountDetail> details;   // 口座明細 (演習4 複数検索用)
    
    // コンストラクタ
    public Account() {
    }
    
    public Account(String accountNo, String password, String customerName, int balance) {
        this.accountNo     = accountNo;
        this.password      = password;
        this.customerName  = customerName;
        this.balance       = balance;
        
        this.details = new ArrayList<AccountDetail>();
    }
    
    // ゲッター
    public String getAccountNo() {
        return accountNo;
    }
    public String getPassword() {
        return password;
    }
    public String getCustomerName() {
        return customerName;
    }
    public int getBalance() {
        return balance;
    }

    public ArrayList<AccountDetail> getDetails() {
        return details;
    }
    
    // セッター
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setDetails(ArrayList<AccountDetail> details) {
        this.details = details;
    }
}
