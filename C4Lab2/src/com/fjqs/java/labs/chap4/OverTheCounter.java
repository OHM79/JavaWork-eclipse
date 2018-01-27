/*
 *   �N���X��        �Fcom.fjqs.java.labs.chap4.OverTheCounter
 *   �\�[�X�t�@�C�����FOverTheCounter.java
 *   ���쌠�\��      �FCopyright 2015 Fujitsu Kyushu Systems Limited
 */

package com.fjqs.java.labs.chap4;

// �X���̔��N���X
public class OverTheCounter extends Sale {

	private static final float DISCOUNT_RATE = 0.1f;		// �l����

	// ����������
	public OverTheCounter(String goods, int price) {
		super(goods, price);
	}

	// ����\������
	public void display() {
		System.out.println("�X���̔����̉��i");
		super.display();
		System.out.println("�����z: " + discount);
		System.out.println("�����z: " + billed);
		System.out.println("==============");
		System.out.println();
	}

	// �����z���v�Z����
	public void calcDiscount() {
		discount = (int)(totalAmount * DISCOUNT_RATE);
		billed = totalAmount - discount;
	}
}

