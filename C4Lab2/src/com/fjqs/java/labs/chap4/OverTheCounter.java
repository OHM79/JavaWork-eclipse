/*
 *   クラス名        ：com.fjqs.java.labs.chap4.OverTheCounter
 *   ソースファイル名：OverTheCounter.java
 *   著作権表示      ：Copyright 2015 Fujitsu Kyushu Systems Limited
 */

package com.fjqs.java.labs.chap4;

// 店頭販売クラス
public class OverTheCounter extends Sale {

	private static final float DISCOUNT_RATE = 0.1f;		// 値引率

	// 初期化する
	public OverTheCounter(String goods, int price) {
		super(goods, price);
	}

	// 情報を表示する
	public void display() {
		System.out.println("店頭販売時の価格");
		super.display();
		System.out.println("割引額: " + discount);
		System.out.println("請求額: " + billed);
		System.out.println("==============");
		System.out.println();
	}

	// 割引額を計算する
	public void calcDiscount() {
		discount = (int)(totalAmount * DISCOUNT_RATE);
		billed = totalAmount - discount;
	}
}

