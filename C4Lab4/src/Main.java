/*
 *   クラス名        ：Main
 *   ソースファイル名：Main.java
 *   著作権表示      ：Copyright 2015 Fujitsu Kyushu Systems Limited
 */

import com.fjqs.java.labs.chap4.StudentInterface;
import com.fjqs.java.labs.chap4.Student;
import com.fjqs.java.labs.chap4.LaborStudent;

public class Main {

    public static void main(String args[]) {
        // インスタンスの生成
        StudentInterface kenichi
            = new Student("富士田健一", "高校 2 年生");
        LaborStudent toshi
            = new LaborStudent("富士田敏明", "大学 3 年生",
                               "家庭教師", 800000);
        // 情報を表示
        kenichi.printName();
        kenichi.printGrade();
        System.out.println("------------------------------------");
        toshi.printName();
        toshi.printGrade();
        toshi.printDescription();
        toshi.printAnnualIncome();
        System.out.println("------------------------------------");
    }
}

