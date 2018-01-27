/*
 *   クラス名        ：com.fjqs.java.labs.chap4.Sale
 *   ソースファイル名：Sale.java
 *   著作権表示      ：Copyright 2015 Fujitsu Kyushu Systems Limited
 */

package com.fjqs.java.labs.chap4;

// 販売クラス
public abstract class Sale {

	protected String goods; // 商品
	protected int price; // 単価
	protected int quantity; // 個数
	protected int totalAmount; // 合計金額
	protected int discount; // 割引額
	protected int billed; // 請求額

	public Sale(String goods, int price) {
		this.goods = goods;
		this.price = price;
	}

	public void order(int quantity) {
		this.quantity = quantity;
		this.totalAmount = this.price * this.quantity;
	}

	public void display() {
		System.out.println("商品 : " + this.goods);
		System.out.println("単価 : " + this.price);
		System.out.println("個数 : " + this.quantity);
		System.out.println("---------------------------------");
		System.out.println("金額 : " + this.totalAmount);
	}

	public abstract void calcDiscount();

}
