/*
 *   クラス名        ：com.fjqs.java.labs.chap5.Order
 *   ソースファイル名：Order.java
 *   著作権表示      ：Copyright 2015 Fujitsu Kyushu Systems Limited
 */

package com.fjqs.java.labs.chap5;

// 注文クラス
public class Order {
	private String name;			// 品名
	private int    quantity;		// 数量
	
	// 初期化する
	public Order(String name,int quantity) {
		this.name      = name;
		this.quantity  = quantity;
	}
	
	// getter
	public String getName() {
		return name;
	}
	
	public int getQuantity() {
		return quantity;
	}

	// setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}

