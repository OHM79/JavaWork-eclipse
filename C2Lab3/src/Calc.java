/*
 *   クラス名        ：Calc
 *   ソースファイル名：Calc.java
 *   著作権表示      ：Copyright 2015 Fujitsu Kyushu Systems Limited
 */

// 入力された数値の計算クラス
class Calc {

	public static void main(String args[]) {
		int sum = 0; // 数値の合計
		float ave = 0.0f; // 数値の平均

		if (args.length < 1) {
			System.out.println("引数を1つ以上入力してください。");
		} else {
			System.out.println("入力された数値：" + args.length + "個");
			for (String arg : args) {
				//				System.out.println(arg);
				sum += Integer.parseInt(arg);
			}
			System.out.println("合計：" + sum);
			ave = sum / (float) args.length;
			System.out.println("平均：" + ave);
		}
	}
}
