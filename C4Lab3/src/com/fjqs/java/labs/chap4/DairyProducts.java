/*
 *   クラス名        ：com.fjqs.java.labs.chap4.DairyProducts
 *   ソースファイル名：DairyProducts.java
 *   著作権表示      ：Copyright 2015 Fujitsu Kyushu Systems Limited
 */

package com.fjqs.java.labs.chap4;

// Food クラスを継承し、必要な処理を記述してください。

public class DairyProducts extends Food {

	private int pullDate; // 賞味期間

	public DairyProducts(String name, String unit, int price, int pullDate) {
		super(name, unit, price);
		this.pullDate = pullDate;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("賞味期限 : " + this.pullDate + "日");
	}
}
