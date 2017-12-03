/*
 *   クラス名        ：com.fjqs.java.labs.chap4.SchoolStaff
 *   ソースファイル名：SchoolStaff.java
 *   著作権表示      ：Copyright 2015 Fujitsu Kyushu Systems Limited
 */

package com.fjqs.java.labs.chap4;

// 人クラス
public class SchoolStaff {
	
	private String name;		// 名前
	private int    age;			// 年齢
	
	// コンストラクタ
	public SchoolStaff(String name, int age) {
		this.name  = name;
		this.age   = age;
	}
	
	// 情報表示
	public void print() {
		System.out.print("名前は" + name);
		System.out.print("、");
		System.out.println("年齢は" + age + "歳です。");
	}
}

