/*
 *   �N���X��        �Fcom.fjqs.java.labs.chap4.SchoolStaff
 *   �\�[�X�t�@�C�����FSchoolStaff.java
 *   ���쌠�\��      �FCopyright 2015 Fujitsu Kyushu Systems Limited
 */

package com.fjqs.java.labs.chap4;

// �l�N���X
public class SchoolStaff {
	
	private String name;		// ���O
	private int    age;			// �N��
	
	// �R���X�g���N�^
	public SchoolStaff(String name, int age) {
		this.name  = name;
		this.age   = age;
	}
	
	// ���\��
	public void print() {
		System.out.print("���O��" + name);
		System.out.print("�A");
		System.out.println("�N���" + age + "�΂ł��B");
	}
}

