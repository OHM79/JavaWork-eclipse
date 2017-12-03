/*
 *   �N���X��        �Fcom.fjqs.java.labs.chap5.Order
 *   �\�[�X�t�@�C�����FOrder.java
 *   ���쌠�\��      �FCopyright 2015 Fujitsu Kyushu Systems Limited
 */

package com.fjqs.java.labs.chap5;

// �����N���X
public class Order {
	private String name;			// �i��
	private int    quantity;		// ����
	
	// ����������
	public Order(String name,int quantity) {
		this.name      = name;
		this.quantity  = quantity;
	}
	
	// getter
	public String getName() {
		return name;
	}
	
	public int getQuantity() {
		return quantity;
	}

	// setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}

