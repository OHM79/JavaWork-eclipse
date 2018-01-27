/*
 *   �N���X��        �Fcom.fjqs.java.labs.chap4.Sale
 *   �\�[�X�t�@�C�����FSale.java
 *   ���쌠�\��      �FCopyright 2015 Fujitsu Kyushu Systems Limited
 */

package com.fjqs.java.labs.chap4;

// �̔��N���X
public abstract class Sale {

	protected String goods; // ���i
	protected int price; // �P��
	protected int quantity; // ��
	protected int totalAmount; // ���v���z
	protected int discount; // �����z
	protected int billed; // �����z

	public Sale(String goods, int price) {
		this.goods = goods;
		this.price = price;
	}

	public void order(int quantity) {
		this.quantity = quantity;
		this.totalAmount = this.price * this.quantity;
	}

	public void display() {
		System.out.println("���i : " + this.goods);
		System.out.println("�P�� : " + this.price);
		System.out.println("�� : " + this.quantity);
		System.out.println("---------------------------------");
		System.out.println("���z : " + this.totalAmount);
	}

	public abstract void calcDiscount();

}
