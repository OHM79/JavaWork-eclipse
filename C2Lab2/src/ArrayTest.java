/*
 *   �N���X��        �FArrayTest
 *   �\�[�X�t�@�C�����FArrayTest.java
 *   ���쌠�\��      �FCopyright 2015 Fujitsu Kyushu Systems Limited
 */

// �z�����ւ��N���X
class ArrayTest {

	public static void main(String args[]) {
		int[] data = { 40, 24, 95, 48, 37, 52, 77, 17, 68, 80 };

		System.out.println("����ւ��O�̔z��");
		outPut(data);
		// �K�v�ȕϐ�����я������L�q���Ă��������B
		int tmp;
		for (int val = 0; val < Math.ceil(data.length / 2); val++) {
			tmp = data[val];
			data[val] = data[data.length - val - 1];
			data[data.length - val - 1] = tmp;
		}
		System.out.println("����ւ���̔z��");
		outPut(data);
	}

	public static void outPut(int[] str) {
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]);
			if (i != str.length - 1) {
				System.out.print(" , ");
			}
		}
		System.out.println();
	}
}
