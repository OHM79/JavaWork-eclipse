/*
 *   �N���X��        �FMain
 *   �\�[�X�t�@�C�����FMain.java
 *   ���쌠�\��      �FCopyright 2016 Fujitsu Kyushu Systems Limited
 */

import com.fjqs.java.labs.chap5.Shop;

// ���C���N���X
public class Main {
	
	public static void main(String args[]) {
		boolean res1;   		// ���������̐���
		boolean res2;   		// �����ύX�����̐���
		Shop shop = new Shop(); // Shop�C���X�^���X�̐���
		
		// 4���̒�������
		res1 = shop.addOrder("�g�}�g",  5);
		if(!res1){
			System.out.println("���������Ɏ��s���܂���");
			System.exit(1);
		}	

		res1 = shop.addOrder("�Ȃ�"  , 10);
		if(!res1){
			System.out.println("���������Ɏ��s���܂���");
			System.exit(1);
		}	

		res1 = shop.addOrder("�卪"  ,  7);
		if(!res1){
			System.out.println("���������Ɏ��s���܂���");
			System.exit(1);
		}	

		res1 = shop.addOrder("���^�X",  5);
		if(!res1){
			System.out.println("���������Ɏ��s���܂���");
			System.exit(1);
		}	
		
		// ���̕\��
		System.out.println("�������");
		shop.display();
		System.out.println();
		
		// �����ύX�����i�����ԍ�3�̐��ʂ�15�ɕύX�j
		res2 = shop.changeOrder(3, 15);
		if(res2)
		{
			// ���̕\��
			System.out.println("�ύX��̒������");
			shop.display();
		}
		else{
			System.out.println("�����ύX�����Ɏ��s���܂���");
		}
	}
}
