/*
 *   クラス名        ：ArrayTest
 *   ソースファイル名：ArrayTest.java
 *   著作権表示      ：Copyright 2015 Fujitsu Kyushu Systems Limited
 */

// 配列入れ替えクラス
class ArrayTest {

	public static void main(String args[]) {
		int[] data = { 40, 24, 95, 48, 37, 52, 77, 17, 68, 80 };

		System.out.println("入れ替え前の配列");
		outPut(data);
		// 必要な変数および処理を記述してください。
		int tmp;
		for (int val = 0; val < Math.ceil(data.length / 2); val++) {
			tmp = data[val];
			data[val] = data[data.length - val - 1];
			data[data.length - val - 1] = tmp;
		}
		System.out.println("入れ替え後の配列");
		outPut(data);
	}

	public static void outPut(int[] str) {
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]);
			if (i != str.length - 1) {
				System.out.print(" , ");
			}
		}
		System.out.println();
	}
}
