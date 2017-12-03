/*
    クラス名        ：Calc1
    ソースファイル名：Calc1.java
    著作権表示      ：Copyright 2013 Fujitsu Kyushu Systems Limited
*/

public class Calc1 {

	public static void main(String args[]) {
		// 販売データ
		int data[] = { 32, 27, 80, 120, 76, 18, 212, 320, 53, 44, 61, 420 };

		int total = 0; // 合計
		float ave = 0.0f; // 平均値

		// 必要な処理を記述し、Calc1クラスを作成してください。
		for (int i : data) {
			total += i;
		}
		ave = total / (float) data.length;
		System.out.println("平均値 >>" + ave + "個");
		System.out.println("合計 >> " + total + "個");
	}
}
