import java.util.Iterator;

/*
	�N���X��        �FCalc2
	�\�[�X�t�@�C�����FCalc2.java
	���쌠�\��      �FCopyright 2013 Fujitsu Kyushu Systems Limited
*/

public class Calc2 {

	public static void main(String args[]) {
		// �̔��f�[�^
		int data[] = { 32, 27, 80, 120, 76, 18, 212, 320, 53, 44, 61, 420 };

		int maxValue = data[0]; // �ő�l
		int maxMonth = 1; // �ő�l���̔���
		int minValue = data[0]; // �ŏ��l
		int minMonth = 1; // �ŏ��l���̔���

		// �K�v�ȏ������L�q���ACalc2�N���X���쐬���Ă��������B
		for (int i = 0; i < data.length; i++) {
			if (maxValue < data[i]) {
				maxValue = data[i];
				maxMonth = i + 1;
			}

			if (minValue > data[i]) {
				minValue = data[i];
				minMonth = i++;
			}
		}

		System.out.println("�ő�l >> " + maxValue +"�� " + maxMonth + "��");
		System.out.println("�ŏ��l >> " + minValue +"�� " + minMonth + "��");
	}
}
