/*
 *   �N���X��        �FCalc
 *   �\�[�X�t�@�C�����FCalc.java
 *   ���쌠�\��      �FCopyright 2015 Fujitsu Kyushu Systems Limited
 */

// ���͂��ꂽ���l�̌v�Z�N���X
class Calc {

	public static void main(String args[]) {
		int sum = 0; // ���l�̍��v
		float ave = 0.0f; // ���l�̕���

		if (args.length < 1) {
			System.out.println("������1�ȏ���͂��Ă��������B");
		} else {
			System.out.println("���͂��ꂽ���l�F" + args.length + "��");
			for (String arg : args) {
				//				System.out.println(arg);
				sum += Integer.parseInt(arg);
			}
			System.out.println("���v�F" + sum);
			ave = sum / (float) args.length;
			System.out.println("���ρF" + ave);
		}
	}
}
