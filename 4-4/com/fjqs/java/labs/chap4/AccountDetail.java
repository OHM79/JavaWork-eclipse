/*
    クラス名        ：AccountDetail
    ソースファイル名：AccountDetail.java
    著作権表示      ：Copyright 2013 Fujitsu Kyushu Systems Limited
*/

package com.fjqs.java.labs.chap4;

public class AccountDetail {

    private String accountNo;       // 口座番号
    private String brandNo;         // 銘柄番号
    private int    equityHoldings;  // 保有株数
    private int    purchaseAmount;  // 買付額
    
    // コンストラクタ
    public AccountDetail() {
    }
    
    public AccountDetail(String accountNo, String brandNo, int equityHoldings, int purchaseAmount) {
        this.accountNo      = accountNo;
        this.brandNo        = brandNo;
        this.equityHoldings = equityHoldings;
        this.purchaseAmount = purchaseAmount;
    }

    // ゲッター
    public String getAccountNo() {
        return accountNo;
    }
    public String getBrandNo() {
        return brandNo;
    }
    public int getEquityHoldings() {
        return equityHoldings;
    }
    public int getPurchaseAmount() {
        return purchaseAmount;
    }

    // セッター
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }
    public void setBrandNo(String brandNo) {
        this.brandNo = brandNo;
    }
    public void setEquityHoldings(int equityHoldings) {
        this.equityHoldings = equityHoldings;
    }
    public void setPurchaseAmount(int purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }
}
