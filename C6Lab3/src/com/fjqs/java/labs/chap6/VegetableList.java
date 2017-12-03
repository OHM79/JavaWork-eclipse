/*
 *   �N���X��        �Fcom.fjqs.java.labs.chap6.VegetableList
 *   �\�[�X�t�@�C�����FVegetableList.java
 *   ���쌠�\��      �FCopyright 2015 Fujitsu Kyushu Systems Limited
 */

package com.fjqs.java.labs.chap6;

import java.util.*;

/* ���i�R�[�h�ɑΉ����鏤�i���Ȃ��ꍇ�ANotFoundException�̗�O�𔭐����A
   ���\�b�h�Ăяo�����ɗ�O��]�����鏈�����L�q���Ă��������B
 */
 
// ���i�i��؁j�ꗗ�N���X
public class VegetableList {
	
	private HashMap<String,Vegetable> list;			// ���i���X�g
	
	// �R���X�g���N�^
	public VegetableList() {
		list = new HashMap<String,Vegetable>();
		list.put("V001", new Vegetable("V001", "�g�}�g", "pac", 250));
		list.put("V002", new Vegetable("V002", "�Ȃ�", "pac", 300));
		list.put("V003", new Vegetable("V003", "�卪", "�{", 150));
		list.put("V004", new Vegetable("V004", "���^�X", "��", 200));
	}
	
	// ��񌟍��A�\��
	public void search(String code) {
		Vegetable goods = list.get(code);
		
		if(goods != null) {
			// ���̕\��
			System.out.println("�R�[�h\t�i��\t�P��\t�P��");
			System.out.print("----------------------");
			System.out.println("----------------------");

			System.out.print(goods.getCode() + "\t");
			System.out.print(goods.getName() + "\t");
			System.out.print(goods.getUnit() + "\t");
			System.out.println(goods.getPrice() + "\t");
		}
		else {
			// ��O�����̌��m
			String msg = "���i�R�[�h '" + code 
			           + "' �ɑΉ�������͌�����܂���ł���";
			
            // �G���[�������errMsg�Ɋi�[���ꂽ�G���[���b�Z�[�W��
            // �����Ƃ��ė�O�C���X�^���X�𐶐����]������B

		}
	}
	
	// ��񌟍��A�\���i�����Ώہj
	public void search(String codes[]) {
		String errMsg = "";
		boolean errFlag = false;
		
		for(String code: codes) {
			Vegetable goods = list.get(code);
			
			if(goods != null) {

				// ���̕\��
				System.out.println("�R�[�h\t�i��\t�P��\t�P��");
				System.out.print("----------------------");
				System.out.println("----------------------");
				
				System.out.print(goods.getCode() + "\t");
				System.out.print(goods.getName() + "\t");
				System.out.print(goods.getUnit() + "\t");
				System.out.println(goods.getPrice() + "\t");
				
				System.out.print("----------------------");
				System.out.println("----------------------");
			}
			else {
				// ��O����
				errMsg += "���i�R�[�h '" + code
				       + "' �ɑΉ�������͌�����܂���ł���\n";
				errFlag = true;
			}
		}
        // for���𔲂������ɁA�G���[�������errMsg�Ɋi�[���ꂽ�G���[
        // ���b�Z�[�W�������Ƃ��ė�O�C���X�^���X�𐶐����]������B


	}
}
