/*
 *   �N���X��        �Fcom.fjqs.java.labs.chap3.Vegetable
 *   �\�[�X�t�@�C�����FVegetable.java
 *   ���쌠�\��      �FCopyright 2015 Fujitsu Kyushu Systems Limited
 */

// ��؃N���X���p�b�P�[�W�����Ă��������B

// ��؃N���X
public class Vegetable {
	
	private String name;			// �i��
	private String unit;			// �P��
	private int    price;			// �P��
	private int    stock;			// �݌�
	
	// ����������
	public Vegetable(String pName, String pUnit,
								   int pPrice, int pStock) {
		name  = pName;
		unit  = pUnit;
		price = pPrice;
		stock = pStock;
	}
	
	// �����o�ϐ������\�b�h�Ăяo�����ɓn�����\�b�h
	public String getName() {
		return name;
	}
	
	public String getUnit() {
		return unit;
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getStock() {
		return stock;
	}
	
	// �����o�ϐ���ݒ肷�郁�\�b�h
	public void setName(String s) {
		name = s;
	}
	
	public void setUnit(String s) {
		unit = s;
	}
	
	public void setPrice(int i) {
		price = i;
	}
	
	public void setStock(int i) {
		stock = i;
	}
}

