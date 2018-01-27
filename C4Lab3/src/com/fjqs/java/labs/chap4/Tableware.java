/*
 *   クラス名        ：com.fjqs.java.labs.chap4.Tableware
 *   ソースファイル名：Tableware.java
 *   著作権表示      ：Copyright 2015 Fujitsu Kyushu Systems Limited
 */

package com.fjqs.java.labs.chap4;

// GoodsInterface インタフェースを実装し、必要な処理を記述してください。

public class Tableware implements GoodsInterface{

	private String name;			 // 品名
	private String material;		 // 素材
	private int price; 				// 単価
	private int quantity; 			// 注文数
	private int totalAmount;	 	// 合計金額

	public Tableware(String name, String material, int price) {
		this.name = name;
		this.material = material;
		this.price = price;
	}

	public void order(int quantity) {
		this.quantity = quantity;
		this.totalAmount = this.price* this.quantity;
	}

	public void display() {
		System.out.println("品名     : " + this.name);
		System.out.println("素材     : " + this.material);
		System.out.println("単価     : " + this.price);
		System.out.println("注文数   : " + this.quantity);
		System.out.println("合計金額 : " + this.totalAmount);
	}

}
