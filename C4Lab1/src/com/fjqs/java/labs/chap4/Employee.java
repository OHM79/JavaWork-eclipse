/*
 *   �N���X��        �Fcom.fjqs.java.labs.chap4.Employee
 *   �\�[�X�t�@�C�����FEmployee.java
 *   ���쌠�\��      �FCopyright 2015 Fujitsu Kyushu Systems Limited
 */

package com.fjqs.java.labs.chap4;

// �K�v�ȃ����o�ϐ�����у��\�b�h������ Employee�N���X���`���Ă��������B
public class Employee extends SchoolStaff {
	private String description;

	public Employee(String name, int age, String description) {
		super(name, age);
		this.description = description;
	}

	public void print() {
		super.print();
		System.out.println(this.description + "�ł��B");
	}
}