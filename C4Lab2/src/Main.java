
/*
 *   クラス名        ：Main
 *   ソースファイル名：Main.java
 *   著作権表示      ：Copyright 2015 Fujitsu Kyushu Systems Limited
 */

import com.fjqs.java.labs.chap4.OverTheCounter;
import com.fjqs.java.labs.chap4.MailOrder;
import com.fjqs.java.labs.chap4.Sale;

// メインクラス
public class Main {

	public static void main(String args[]) {

		Sale sales[] = new Sale[5]; // 販売

		// インスタンスの生成
		sales[0] = new OverTheCounter("トマト", 250);
		sales[1] = new OverTheCounter("りんご", 120);
		sales[2] = new OverTheCounter("きゅうり", 80);
		sales[3] = new MailOrder("りんご", 120);
		sales[4] = new MailOrder("ぶどう", 470);

		// 注文する
		sales[0].order(20);
		sales[1].order(15);
		sales[2].order(7);
		sales[3].order(12);
		sales[4].order(3);

		for (int i = 0; i < sales.length; i++) {
			sales[i].calcDiscount();
		}

		for (int i = 0; i < sales.length; i++) {
			sales[i].display();
		}

	}
}
