/*
 *   クラス名        ：com.fjqs.java.labs.chap4.Student
 *   ソースファイル名：Student.java
 *   著作権表示      ：Copyright 2015 Fujitsu Kyushu Systems Limited
 */

package com.fjqs.java.labs.chap4;

// 生徒クラス
public class Student implements StudentInterface {

    private String name;         // 名前
    private String grade;        // 学年
    
    // コンストラクタ
    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }
    
    // 名前表示
    public void printName() {
        System.out.println(name + "です");
    }
    
    // 学年表示
    public void printGrade() {
        System.out.println(grade + "です");
    }
}

