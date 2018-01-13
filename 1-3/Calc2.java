import java.util.Iterator;

/*
	クラス名        ：Calc2
	ソースファイル名：Calc2.java
	著作権表示      ：Copyright 2013 Fujitsu Kyushu Systems Limited
*/

public class Calc2 {

	public static void main(String args[]) {
		// 販売データ
		int data[] = { 32, 27, 80, 120, 76, 18, 212, 320, 53, 44, 61, 420 };

		int maxValue = data[0]; // 最大値
		int maxMonth = 1; // 最大値時販売月
		int minValue = data[0]; // 最小値
		int minMonth = 1; // 最小値時販売月

		// 必要な処理を記述し、Calc2クラスを作成してください。
		for (int i = 0; i < data.length; i++) {
			if (maxValue < data[i]) {
				maxValue = data[i];
				maxMonth = i + 1;
			}

			if (minValue > data[i]) {
				minValue = data[i];
				minMonth = i++;
			}
		}

		System.out.println("最大値 >> " + maxValue +"個 " + maxMonth + "月");
		System.out.println("最小値 >> " + minValue +"個 " + minMonth + "月");
	}
}
