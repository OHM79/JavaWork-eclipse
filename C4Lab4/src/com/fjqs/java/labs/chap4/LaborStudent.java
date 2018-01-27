/*
 *   クラス名        ：com.fjqs.java.labs.chap4.LaborStudent
 *   ソースファイル名：LaborStudent.java
 *   著作権表示      ：Copyright 2015 Fujitsu Kyushu Systems Limited
 */

package com.fjqs.java.labs.chap4;

// 勤労学生クラス
public class LaborStudent implements LaborStudentInterface {

	private EmployeeInterface emp;       // 従業員
	private StudentInterface stu;        // 生徒

	public LaborStudent(String name, String grade, String description, int annualIncome) {
		emp = new Employee(name, description, annualIncome);
		stu = new Student(name, grade);
	}

	public void printName() {
		stu.printName();
	}

	public void printGrade() {
		stu.printGrade();
	}

	public void printDescription() {
		emp.printDescription();
	}

	public void printAnnualIncome() {
		emp.printAnnualIncome();
	}
}

