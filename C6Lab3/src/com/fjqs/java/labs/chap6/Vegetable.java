/*
 *   クラス名        ：com.fjqs.java.labs.chap6.Vegetable
 *   ソースファイル名：Vegetable.java
 *   著作権表示      ：Copyright 2015 Fujitsu Kyushu Systems Limited
 */

package com.fjqs.java.labs.chap6;

public class Vegetable {
	
	private String code;			// 商品コード
	private String name;			// 品名
	private String unit;			// 単位
	private int    price;			// 単価
	
	// 初期化する
	public Vegetable(String code, String name, String unit, int price) {
		this.code = code;
		this.name = name;
		this.unit = unit;
		this.price = price;
	}
	
	// getter
	public String getCode() {
		return code;
	}
	
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

