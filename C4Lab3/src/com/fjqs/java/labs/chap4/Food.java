/*
 *   クラス名        ：com.fjqs.java.labs.chap4.Food
 *   ソースファイル名：Food.java
 *   著作権表示      ：Copyright 2015 Fujitsu Kyushu Systems Limited
 */

package com.fjqs.java.labs.chap4;

// 食品クラス
public abstract class Food implements GoodsInterface {

	private String name;			// 品名
	private String unit;			// 単位
	private int    price;			// 単価
	private int    quantity;		// 注文数
	private int    totalAmount;		// 合計金額

	// 初期化する
	public Food(String name, String unit, int price) {
		this.name = name;
		this.unit = unit;
		this.price = price;
	}

	// 注文する（注文数を決定する）
	public void order(int quantity) {
		this.quantity = quantity;
		totalAmount = price * quantity;
	}

	// 情報を表示する
	public void display() {
		System.out.println("品名     : " + name);
		System.out.println("単位     : " + unit);
		System.out.println("単価     : " + price);
		System.out.println("注文数   : " + quantity);
		System.out.println("合計金額 : " + totalAmount);
	}
}

