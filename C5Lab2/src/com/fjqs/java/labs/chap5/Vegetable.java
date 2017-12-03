/*
 *   �N���X��        �Fcom.fjqs.java.labs.chap5.Vegetable
 *   �\�[�X�t�@�C�����FVegetable.java
 *   ���쌠�\��      �FCopyright 2015 Fujitsu Kyushu Systems Limited
 */

package com.fjqs.java.labs.chap5;

// ��؃N���X
public class Vegetable {
	
	private String name;			// �i��
	private String unit;			// �P��
	private int    price;			// �P��
	
	// ����������
	public Vegetable(String name, String unit, int price) {
		this.name  = name;
		this.unit  = unit;
		this.price = price;
	}
	
	// getter
	public String getName() {
		return name;
	}
	
	public String getUnit() {
		return unit;
	}
	
	public int getPrice() {
		return price;
	}
}

