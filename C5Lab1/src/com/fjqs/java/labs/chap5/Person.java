/*
 *   �N���X��        �Fcom.fjqs.java.labs.chap5.Person
 *   �\�[�X�t�@�C�����FPerson.java
 *   ���쌠�\��      �FCopyright 2015 Fujitsu Kyushu Systems Limited
 */

package com.fjqs.java.labs.chap5;

// �l���N���X
public class Person {
	
	private String name;		// ���O
	private String address;		// �Z��
	private int    age;			// �N��

	// �R���X�g���N�^
	public Person(String name, String address, int age) {
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
	// ���\��
	public void display() {
		System.out.print(name + " ���� >> ");
		System.out.print("�Z�� : " + address + " | ");
		System.out.println("�N�� : " + age + " ��");
	}

	// getter
	public String getName(){
		return name;
	}

	public String getAddress(){
		return address;
	}

	public int getAge(){
		return age;
	}
}
