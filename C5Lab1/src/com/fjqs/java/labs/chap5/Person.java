/*
 *   クラス名        ：com.fjqs.java.labs.chap5.Person
 *   ソースファイル名：Person.java
 *   著作権表示      ：Copyright 2015 Fujitsu Kyushu Systems Limited
 */

package com.fjqs.java.labs.chap5;

// 個人情報クラス
public class Person {
	
	private String name;		// 名前
	private String address;		// 住所
	private int    age;			// 年齢

	// コンストラクタ
	public Person(String name, String address, int age) {
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
	// 情報表示
	public void display() {
		System.out.print(name + " さん >> ");
		System.out.print("住所 : " + address + " | ");
		System.out.println("年齢 : " + age + " 歳");
	}

	// getter
	public String getName(){
		return name;
	}

	public String getAddress(){
		return address;
	}

	public int getAge(){
		return age;
	}
}
