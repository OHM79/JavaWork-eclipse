/*
 *   クラス名        ：Main
 *   ソースファイル名：Main.java
 *   著作権表示      ：Copyright 2016 Fujitsu Kyushu Systems Limited
 */

// メインクラス
class Main {
	
	public static void main(String args[]) {
		
		// インスタンスの生成
		Vegetable spinach = new Vegetable();
		
		int total = 0;				// 売上合計
		int tax   = 0;				// 消費税
		
		// 初期化
		spinach.initialize("ほうれん草", "束", 200);
		
		// 注文処理
		spinach.order(5);
		
		// 合計と消費税の計算
		total = spinach.getTotal();
		tax   = (int)(total * Vegetable.TAX);
		
		// 情報の表示
		System.out.println("------------------------------");
		System.out.println("品名   : " + spinach.name);
		System.out.println("単位   : " + spinach.unit);
		System.out.println("単価   : " + spinach.price);
		System.out.println("注文数 : " + spinach.quantity);
		System.out.println("------------------------------");
		System.out.println("売上金額 : " + total);
		System.out.println("消費税   : " + tax);
		System.out.println("合計     : " + (total + tax));
		System.out.println("------------------------------");
	}
}

