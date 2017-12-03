/*
 *   クラス名        ：com.fjqs.java.labs.chap5.Vegetable
 *   ソースファイル名：Vegetable.java
 *   著作権表示      ：Copyright 2015 Fujitsu Kyushu Systems Limited
 */

package com.fjqs.java.labs.chap5;

// 野菜クラス
public class Vegetable {
	
	private String name;			// 品名
	private String unit;			// 単位
	private int    price;			// 単価
	
	// 初期化する
	public Vegetable(String name, String unit, int price) {
		this.name  = name;
		this.unit  = unit;
		this.price = price;
	}
	
	// getter
	public String getName() {
		return name;
	}
	
	public String getUnit() {
		return unit;
	}
	
	public int getPrice() {
		return price;
	}
}

