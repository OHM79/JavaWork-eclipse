/*
 *   �N���X��        �Fcom.fjqs.java.labs.chap4.MailOrder
 *   �\�[�X�t�@�C�����FMailOrder.java
 *   ���쌠�\��      �FCopyright 2015 Fujitsu Kyushu Systems Limited
 */

package com.fjqs.java.labs.chap4;

// �ʐM�̔��N���X�i
public class MailOrder extends Sale {

	private static final float DISCOUNT_RATE = 0.2f;	// �l����
	private static final int   MAILING_COST  = 500;		// ����

	// ����������
	public MailOrder(String goods, int price) {
		super(goods, price);
	}

	// ����\������
	public void display() {
		System.out.println("�ʐM�̔����̉��i");
		super.display();
		System.out.println("�����z: " + discount);
		System.out.println("����  : " + MAILING_COST);
		System.out.println("�����z: " + billed);
		System.out.println("==============");
		System.out.println();
	}

	// �����z���v�Z����
	public void calcDiscount() {
		discount = (int)(totalAmount * DISCOUNT_RATE);
		billed = totalAmount - discount + MAILING_COST;
	}
}

