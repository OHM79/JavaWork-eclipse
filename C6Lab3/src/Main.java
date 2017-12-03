/*
 *   クラス名        ：Main
 *   ソースファイル名：Main.java
 *   著作権表示      ：Copyright 2015 Fujitsu Kyushu Systems Limited
 */

import com.fjqs.java.labs.chap6.VegetableList;
import com.fjqs.java.labs.chap6.NotFoundException;

public class Main {
	
	public static void main(String args[]) {
		if(args.length < 1) {
			System.out.println("商品コードを入力してください");
			System.exit(-1);
		}
		
		// インスタンスの生成
		VegetableList list = new VegetableList();
		
		// 情報の表示
		try {
			if(args.length == 1) {
				list.search(args[0]);
			}
			else {
				list.search(args);
			}
		}
		catch(NotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
