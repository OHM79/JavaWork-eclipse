/*
 *   �N���X��        �FMain
 *   �\�[�X�t�@�C�����FMain.java
 *   ���쌠�\��      �FCopyright 2016 Fujitsu Kyushu Systems Limited
 */

// ���C���N���X
class Main {
	
	public static void main(String args[]) {
		
		// �C���X�^���X�̐���
		Vegetable spinach = new Vegetable();
		
		int total = 0;				// ���㍇�v
		int tax   = 0;				// �����
		
		// ������
		spinach.initialize("�ق����", "��", 200);
		
		// ��������
		spinach.order(5);
		
		// ���v�Ə���ł̌v�Z
		total = spinach.getTotal();
		tax   = (int)(total * Vegetable.TAX);
		
		// ���̕\��
		System.out.println("------------------------------");
		System.out.println("�i��   : " + spinach.name);
		System.out.println("�P��   : " + spinach.unit);
		System.out.println("�P��   : " + spinach.price);
		System.out.println("������ : " + spinach.quantity);
		System.out.println("------------------------------");
		System.out.println("������z : " + total);
		System.out.println("�����   : " + tax);
		System.out.println("���v     : " + (total + tax));
		System.out.println("------------------------------");
	}
}

