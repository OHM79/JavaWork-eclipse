/*
 *   クラス名        ：com.fjqs.java.labs.chap4.Student
 *   ソースファイル名：Student.java
 *   著作権表示      ：Copyright 2015 Fujitsu Kyushu Systems Limited
 */

package com.fjqs.java.labs.chap4;

// 必要なメンバ変数およびメソッドを持つ Studentクラスを定義してください。
public class Student extends SchoolStaff {
	private String grade;

	public Student(String name, int age, String grade) {
		super(name, age);
		this.grade = grade;
	}

	public void print() {
		super.print();
		System.out.println(this.grade + "です。");
	}
}