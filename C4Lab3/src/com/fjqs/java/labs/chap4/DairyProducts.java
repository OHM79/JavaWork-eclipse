/*
 *   �N���X��        �Fcom.fjqs.java.labs.chap4.DairyProducts
 *   �\�[�X�t�@�C�����FDairyProducts.java
 *   ���쌠�\��      �FCopyright 2015 Fujitsu Kyushu Systems Limited
 */

package com.fjqs.java.labs.chap4;

// Food �N���X���p�����A�K�v�ȏ������L�q���Ă��������B

public class DairyProducts extends Food {

	private int pullDate; // �ܖ�����

	public DairyProducts(String name, String unit, int price, int pullDate) {
		super(name, unit, price);
		this.pullDate = pullDate;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("�ܖ����� : " + this.pullDate + "��");
	}
}
