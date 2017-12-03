/*
 *   クラス名        ：Main
 *   ソースファイル名：Main.java
 *   著作権表示      ：Copyright 2015 Fujitsu Kyushu Systems Limited
 */

import com.fjqs.java.labs.chap6.Calc;

// メインクラス
public class Main {
	
	public static void main(String args[]) {
		if(args.length != 3) {
			System.out.println("'java Main 演算子 数値1 数値2'"
							 + "の形式で実行してください");
			System.exit(-1);
		}

	    // 例外処理を記述してください。
		
		String str  = args[0];
		int    num1 = Integer.parseInt(args[1]);
		int    num2 = Integer.parseInt(args[2]);
		
		if(str.equals("add")) {
			Calc.calcAddition(num1, num2);
		}
		else if(str.equals("sub")) {
			Calc.calcSubtraction(num1, num2);
		}
		else if(str.equals("mul")) {
			Calc.calcMultiplication(num1, num2);
		}
		else if(str.equals("div")) {
			Calc.calcDivision(num1, num2);
		}
		else {
			System.out.println("演算子には" + 
					"'add', 'sub', 'mul', 'div'を指定してください");
			System.exit(-1);
		}
	}
}

