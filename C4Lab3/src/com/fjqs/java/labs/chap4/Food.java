/*
 *   �N���X��        �Fcom.fjqs.java.labs.chap4.Food
 *   �\�[�X�t�@�C�����FFood.java
 *   ���쌠�\��      �FCopyright 2015 Fujitsu Kyushu Systems Limited
 */

package com.fjqs.java.labs.chap4;

// �H�i�N���X
public abstract class Food implements GoodsInterface {

	private String name;			// �i��
	private String unit;			// �P��
	private int    price;			// �P��
	private int    quantity;		// ������
	private int    totalAmount;		// ���v���z

	// ����������
	public Food(String name, String unit, int price) {
		this.name = name;
		this.unit = unit;
		this.price = price;
	}

	// ��������i�����������肷��j
	public void order(int quantity) {
		this.quantity = quantity;
		totalAmount = price * quantity;
	}

	// ����\������
	public void display() {
		System.out.println("�i��     : " + name);
		System.out.println("�P��     : " + unit);
		System.out.println("�P��     : " + price);
		System.out.println("������   : " + quantity);
		System.out.println("���v���z : " + totalAmount);
	}
}

