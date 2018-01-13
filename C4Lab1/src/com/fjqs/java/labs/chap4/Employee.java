/*
 *   クラス名        ：com.fjqs.java.labs.chap4.Employee
 *   ソースファイル名：Employee.java
 *   著作権表示      ：Copyright 2015 Fujitsu Kyushu Systems Limited
 */

package com.fjqs.java.labs.chap4;

// 必要なメンバ変数およびメソッドを持つ Employeeクラスを定義してください。
public class Employee extends SchoolStaff {
	private String description;

	public Employee(String name, int age, String description) {
		super(name, age);
		this.description = description;
	}

	public void print() {
		super.print();
		System.out.println(this.description + "です。");
	}
}