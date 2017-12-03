/*
    クラス名        ：Account
    ソースファイル名：Account.java
    著作権表示      ：Copyright 2013 Fujitsu Kyushu Systems Limited
*/

package com.fjqs.java.labs.chap4;


public class Account {

    private String accountNo;       // 口座番号
    private String password;        // パスワード
    private String customerName;    // 顧客名
    private int    balance;         // 買付余力
    
    // コンストラクタ
    public Account() {
    }
    
    public Account(String accountNo, String password, String customerName, int balance) {
        this.accountNo     = accountNo;
        this.password      = password;
        this.customerName  = customerName;
        this.balance       = balance;
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
}
