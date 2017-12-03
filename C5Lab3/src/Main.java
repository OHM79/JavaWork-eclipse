/*
 *   クラス名        ：Main
 *   ソースファイル名：Main.java
 *   著作権表示      ：Copyright 2015 Fujitsu Kyushu Systems Limited
 */

import com.fjqs.java.labs.chap5.Shop;
import com.fjqs.java.labs.chap5.Vegetable;

// メインクラス
public class Main {
	
	public static void main(String args[]) {
		// インスタンスの生成
		Shop shop = new Shop();
		
		// 注文処理
		shop.addOrder(new Vegetable("V001", "トマト", "pac", 250), 5);
		shop.addOrder(new Vegetable("V002", "なす", "pac", 300), 10);
		shop.addOrder(new Vegetable("V003", "大根", "本", 150), 7);
		shop.addOrder(new Vegetable("V004", "レタス", "玉", 200), 5);
		
		// 情報の表示
		System.out.println("注文情報");
		shop.display();
		
		System.out.println();
		
		// 変更後、情報の表示
		shop.changeOrder("V002", 20);
		System.out.println("変更後の注文情報");
		shop.display();
	}
}

