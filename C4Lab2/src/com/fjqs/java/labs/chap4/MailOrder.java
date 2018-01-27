/*
 *   クラス名        ：com.fjqs.java.labs.chap4.MailOrder
 *   ソースファイル名：MailOrder.java
 *   著作権表示      ：Copyright 2015 Fujitsu Kyushu Systems Limited
 */

package com.fjqs.java.labs.chap4;

// 通信販売クラス（
public class MailOrder extends Sale {

	private static final float DISCOUNT_RATE = 0.2f;	// 値引率
	private static final int   MAILING_COST  = 500;		// 送料

	// 初期化する
	public MailOrder(String goods, int price) {
		super(goods, price);
	}

	// 情報を表示する
	public void display() {
		System.out.println("通信販売時の価格");
		super.display();
		System.out.println("割引額: " + discount);
		System.out.println("送料  : " + MAILING_COST);
		System.out.println("請求額: " + billed);
		System.out.println("==============");
		System.out.println();
	}

	// 割引額を計算する
	public void calcDiscount() {
		discount = (int)(totalAmount * DISCOUNT_RATE);
		billed = totalAmount - discount + MAILING_COST;
	}
}

