/*
 *   クラス名        ：Main
 *   ソースファイル名：Main.java
 *   著作権表示      ：Copyright 2016 Fujitsu Kyushu Systems Limited
 */

import com.fjqs.java.labs.chap5.Shop;

// メインクラス
public class Main {
	
	public static void main(String args[]) {
		boolean res1;   		// 注文処理の成否
		boolean res2;   		// 注文変更処理の成否
		Shop shop = new Shop(); // Shopインスタンスの生成
		
		// 4件の注文処理
		res1 = shop.addOrder("トマト",  5);
		if(!res1){
			System.out.println("注文処理に失敗しました");
			System.exit(1);
		}	

		res1 = shop.addOrder("なす"  , 10);
		if(!res1){
			System.out.println("注文処理に失敗しました");
			System.exit(1);
		}	

		res1 = shop.addOrder("大根"  ,  7);
		if(!res1){
			System.out.println("注文処理に失敗しました");
			System.exit(1);
		}	

		res1 = shop.addOrder("レタス",  5);
		if(!res1){
			System.out.println("注文処理に失敗しました");
			System.exit(1);
		}	
		
		// 情報の表示
		System.out.println("注文情報");
		shop.display();
		System.out.println();
		
		// 注文変更処理（注文番号3の数量を15に変更）
		res2 = shop.changeOrder(3, 15);
		if(res2)
		{
			// 情報の表示
			System.out.println("変更後の注文情報");
			shop.display();
		}
		else{
			System.out.println("注文変更処理に失敗しました");
		}
	}
}
