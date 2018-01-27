/*
 *   �N���X��        �Fcom.fjqs.java.labs.chap4.Tableware
 *   �\�[�X�t�@�C�����FTableware.java
 *   ���쌠�\��      �FCopyright 2015 Fujitsu Kyushu Systems Limited
 */

package com.fjqs.java.labs.chap4;

// GoodsInterface �C���^�t�F�[�X���������A�K�v�ȏ������L�q���Ă��������B

public class Tableware implements GoodsInterface{

	private String name;			 // �i��
	private String material;		 // �f��
	private int price; 				// �P��
	private int quantity; 			// ������
	private int totalAmount;	 	// ���v���z

	public Tableware(String name, String material, int price) {
		this.name = name;
		this.material = material;
		this.price = price;
	}

	public void order(int quantity) {
		this.quantity = quantity;
		this.totalAmount = this.price* this.quantity;
	}

	public void display() {
		System.out.println("�i��     : " + this.name);
		System.out.println("�f��     : " + this.material);
		System.out.println("�P��     : " + this.price);
		System.out.println("������   : " + this.quantity);
		System.out.println("���v���z : " + this.totalAmount);
	}

}
