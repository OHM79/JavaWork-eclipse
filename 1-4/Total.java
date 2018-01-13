/*
	クラス名        ：Total
	ソースファイル名：Total.java
	著作権表示      ：Copyright 2013 Fujitsu Kyushu Systems Limited
*/

public class Total {
	public static void main(String args[]) {
		int m; // 整数 m
		int n; // 整数 n
		int sum;

		try {
//			引数の数を判定
			if (args.length < 1) {
				throw new Exception("引数を1つ以上入力してください。");
			} else if (args.length > 2) {
				throw new Exception("引数を2つにしてください。");
			} else {
				m = Integer.parseInt(args[0]);
				n = Integer.parseInt(args[1]);
			}

//			引数の大小を判定
			if (n < m) {
				int tmp;
				tmp = n;
				n = m;
				m = tmp;
			}

			for (int i = m; i <=n; i++) {

			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("エラー:" + e.getMessage());
		}

	}
}
