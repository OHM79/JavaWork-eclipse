/*
    クラス名        ：Brand
    ソースファイル名：Brand.java
    著作権表示      ：Copyright 2013 Fujitsu Kyushu Systems Limited
*/

package com.fjqs.java.labs.chap4;

public class Brand {

    private String number;          // 銘柄番号
    private String name;            // 銘柄
    private int    presentPrice;    // 現在値
    
    // コンストラクタ
    public Brand() {
    }
    
    public Brand(String number, String name, int presentPrice) {
        this.number       = number;
        this.name         = name;
        this.presentPrice = presentPrice;
    }
    
    // ゲッター
    public String getNumber() {
        return number;
    }
    public String getName() {
        return name;
    }
    public int getPresentPrice() {
        return presentPrice;
    }
    
    // セッター
    public void setNumber(String number) {
        this.number = number;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPresentPrice(int presentPrice) {
        this.presentPrice = presentPrice;
    }
}
