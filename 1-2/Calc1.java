/*
    �N���X��        �FCalc1
    �\�[�X�t�@�C�����FCalc1.java
    ���쌠�\��      �FCopyright 2013 Fujitsu Kyushu Systems Limited
*/

public class Calc1 {

	public static void main(String args[]) {
		// �̔��f�[�^
		int data[] = { 32, 27, 80, 120, 76, 18, 212, 320, 53, 44, 61, 420 };

		int total = 0; // ���v
		float ave = 0.0f; // ���ϒl

		// �K�v�ȏ������L�q���ACalc1�N���X���쐬���Ă��������B
		for (int i : data) {
			total += i;
		}
		ave = total / (float) data.length;
		System.out.println("���ϒl >>" + ave + "��");
		System.out.println("���v >> " + total + "��");
	}
}
