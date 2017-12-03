/*
 *   クラス名        ：Main
 *   ソースファイル名：Main.java
 *   著作権表示      ：Copyright 2015 Fujitsu Kyushu Systems Limited
 */

import com.fjqs.java.labs.chap4.Student;
import com.fjqs.java.labs.chap4.Employee;

public class Main {
	
	public static void main(String args[]) {
		// インスタンスの生成
		Student kenichi = new Student("富士田健一", 17, "高校2年生");
		Employee taro = new Employee("田中太郎", 45, "数学教師");
		
		// 情報を表示
		System.out.println("------------------------------------");
		kenichi.print();
		System.out.println("------------------------------------");
		taro.print();
		System.out.println("------------------------------------");
	}
}

