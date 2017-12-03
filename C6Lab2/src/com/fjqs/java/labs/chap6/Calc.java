/*
 *   クラス名        ：com.fjqs.java.labs.chap6.Calc
 *   ソースファイル名：Calc.java
 *   著作権表示      ：Copyright 2015 Fujitsu Kyushu Systems Limited
 */

package com.fjqs.java.labs.chap6;

// 四則演算を行うクラス
public class Calc {

	// 足算
	public static void calcAddition(int num1, int num2) {
		int ans = num1 + num2;
		System.out.println(num1 + " ＋ " + num2 + " = " + ans);
	}
	// 引算
	public static void calcSubtraction(int num1, int num2) {
		int ans = num1 - num2;
		System.out.println(num1 + " － " + num2 + " = " + ans);
	}
	
	// 掛算
	public static void calcMultiplication(int num1, int num2) {
		int ans = num1 * num2;
		System.out.println(num1 + " × " + num2 + " = " + ans);
	}
	
	// 割算
	// 例外処理を記述してください。
	public static void calcDivision(int num1, int num2) {
		int ans = num1 / num2;
		System.out.println(num1 + " ÷ " + num2 + " = " + ans);
	}
}

