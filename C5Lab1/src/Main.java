/*
 *   クラス名        ：Main
 *   ソースファイル名：Main.java
 *   著作権表示      ：Copyright 2015 Fujitsu Kyushu Systems Limited
 */

import com.fjqs.java.labs.chap5.Person;
import java.util.*;

// メインクラス
public class Main {
	
	public static void main(String args[]) {
		// 人のリスト
		ArrayList<Person> personList = new ArrayList<Person>();		
		
		// 年齢の合計値
		int sum = 0;
		// 平均年齢
		float ave = 0.0f;
		

		// インスタンス生成と個人情報登録
		Person person1 = new Person("田中一郎", "東京都大田区", 29);
		Person person2 = new Person("山田花子", "神奈川県川崎市", 25);
		Person person3 = new Person("鈴木健二", "千葉県千葉市", 22);
		Person person4 = new Person("佐藤一", "埼玉県さいたま市", 23);
		
		// 個人情報を personList へ登録後、表示する処理を記述してください
        //（平均年齢も算出してください）。
	}
}

