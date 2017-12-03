/*
 *   クラス名        ：Main
 *   ソースファイル名：Main.java
 *   著作権表示      ：Copyright 2015 Fujitsu Kyushu Systems Limited
 */

import com.fjqs.java.labs.chap4.GoodsInterface;
import com.fjqs.java.labs.chap4.DairyProducts;
import com.fjqs.java.labs.chap4.Tableware;


// メインクラス
public class Main {
	
	public static void main(String args[]) {
		// インスタンスの生成
		GoodsInterface goods1 =
			new DairyProducts("牛乳", "1リットル", 200, 7);
		GoodsInterface goods2 = new Tableware("小皿", "陶器製", 500);
		
		// 注文処理
		goods1.order(5);
		goods2.order(2);
		
		// 情報の表示
		System.out.println("注文情報");
		goods1.display();
		System.out.println("------------------------------");
		goods2.display();
	}
}

