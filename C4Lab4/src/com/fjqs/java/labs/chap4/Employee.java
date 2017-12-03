/*
 *   クラス名        ：com.fjqs.java.labs.chap4.Employee
 *   ソースファイル名：Employee.java
 *   著作権表示      ：Copyright 2015 Fujitsu Kyushu Systems Limited
 */

package com.fjqs.java.labs.chap4;

// 従業員クラス
public class Employee implements EmployeeInterface {

    private String name;            // 名前
    private String description;     // 職種
    private int annualIncome;       // 年収
    
    // コンストラクタ
    public Employee(String name, String description,
                                                 int annualIncome) {
        this.name = name;
        this.description = description;
        this.annualIncome = annualIncome;
    }
    
    // 名前表示
    public void printName() {
        System.out.println(name + "です");
    }
    
    // 職種表示
    public void printDescription() {
        System.out.println(description + "をやっています");
    }
    
    // 年収表示
    public void printAnnualIncome() {
        System.out.println("年収は、 " + annualIncome + " 円です");
    }
}

