/*
 *   �N���X��        �Fcom.fjqs.java.labs.chap4.LaborStudent
 *   �\�[�X�t�@�C�����FLaborStudent.java
 *   ���쌠�\��      �FCopyright 2015 Fujitsu Kyushu Systems Limited
 */

package com.fjqs.java.labs.chap4;

// �ΘJ�w���N���X
public class LaborStudent implements LaborStudentInterface {

	private EmployeeInterface emp;       // �]�ƈ�
	private StudentInterface stu;        // ���k

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

