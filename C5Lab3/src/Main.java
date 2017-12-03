/*
 *   �N���X��        �FMain
 *   �\�[�X�t�@�C�����FMain.java
 *   ���쌠�\��      �FCopyright 2015 Fujitsu Kyushu Systems Limited
 */

import com.fjqs.java.labs.chap5.Shop;
import com.fjqs.java.labs.chap5.Vegetable;

// ���C���N���X
public class Main {
	
	public static void main(String args[]) {
		// �C���X�^���X�̐���
		Shop shop = new Shop();
		
		// ��������
		shop.addOrder(new Vegetable("V001", "�g�}�g", "pac", 250), 5);
		shop.addOrder(new Vegetable("V002", "�Ȃ�", "pac", 300), 10);
		shop.addOrder(new Vegetable("V003", "�卪", "�{", 150), 7);
		shop.addOrder(new Vegetable("V004", "���^�X", "��", 200), 5);
		
		// ���̕\��
		System.out.println("�������");
		shop.display();
		
		System.out.println();
		
		// �ύX��A���̕\��
		shop.changeOrder("V002", 20);
		System.out.println("�ύX��̒������");
		shop.display();
	}
}

