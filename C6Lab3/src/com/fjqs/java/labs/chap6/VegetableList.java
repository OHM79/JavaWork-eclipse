/*
 *   クラス名        ：com.fjqs.java.labs.chap6.VegetableList
 *   ソースファイル名：VegetableList.java
 *   著作権表示      ：Copyright 2015 Fujitsu Kyushu Systems Limited
 */

package com.fjqs.java.labs.chap6;

import java.util.*;

/* 商品コードに対応する商品がない場合、NotFoundExceptionの例外を発生し、
   メソッド呼び出し側に例外を転送する処理を記述してください。
 */
 
// 商品（野菜）一覧クラス
public class VegetableList {
	
	private HashMap<String,Vegetable> list;			// 商品リスト
	
	// コンストラクタ
	public VegetableList() {
		list = new HashMap<String,Vegetable>();
		list.put("V001", new Vegetable("V001", "トマト", "pac", 250));
		list.put("V002", new Vegetable("V002", "なす", "pac", 300));
		list.put("V003", new Vegetable("V003", "大根", "本", 150));
		list.put("V004", new Vegetable("V004", "レタス", "玉", 200));
	}
	
	// 情報検索、表示
	public void search(String code) {
		Vegetable goods = list.get(code);
		
		if(goods != null) {
			// 情報の表示
			System.out.println("コード\t品名\t単位\t単価");
			System.out.print("----------------------");
			System.out.println("----------------------");

			System.out.print(goods.getCode() + "\t");
			System.out.print(goods.getName() + "\t");
			System.out.print(goods.getUnit() + "\t");
			System.out.println(goods.getPrice() + "\t");
		}
		else {
			// 例外発生の検知
			String msg = "商品コード '" + code 
			           + "' に対応する情報は見つかりませんでした";
			
            // エラーがあればerrMsgに格納されたエラーメッセージを
            // 引数として例外インスタンスを生成し転送する。

		}
	}
	
	// 情報検索、表示（複数対象）
	public void search(String codes[]) {
		String errMsg = "";
		boolean errFlag = false;
		
		for(String code: codes) {
			Vegetable goods = list.get(code);
			
			if(goods != null) {

				// 情報の表示
				System.out.println("コード\t品名\t単位\t単価");
				System.out.print("----------------------");
				System.out.println("----------------------");
				
				System.out.print(goods.getCode() + "\t");
				System.out.print(goods.getName() + "\t");
				System.out.print(goods.getUnit() + "\t");
				System.out.println(goods.getPrice() + "\t");
				
				System.out.print("----------------------");
				System.out.println("----------------------");
			}
			else {
				// 例外発生
				errMsg += "商品コード '" + code
				       + "' に対応する情報は見つかりませんでした\n";
				errFlag = true;
			}
		}
        // for文を抜けた時に、エラーがあればerrMsgに格納されたエラー
        // メッセージを引数として例外インスタンスを生成し転送する。


	}
}
