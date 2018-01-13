/*
 *   �N���X��        �Fcom.fjqs.java.labs.chap4.Student
 *   �\�[�X�t�@�C�����FStudent.java
 *   ���쌠�\��      �FCopyright 2015 Fujitsu Kyushu Systems Limited
 */

package com.fjqs.java.labs.chap4;

// �K�v�ȃ����o�ϐ�����у��\�b�h������ Student�N���X���`���Ă��������B
public class Student extends SchoolStaff {
	private String grade;

	public Student(String name, int age, String grade) {
		super(name, age);
		this.grade = grade;
	}

	public void print() {
		super.print();
		System.out.println(this.grade + "�ł��B");
	}
}