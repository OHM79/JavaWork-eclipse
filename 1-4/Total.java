/*
	�N���X��        �FTotal
	�\�[�X�t�@�C�����FTotal.java
	���쌠�\��      �FCopyright 2013 Fujitsu Kyushu Systems Limited
*/

public class Total {
	public static void main(String args[]) {
		int m; // ���� m
		int n; // ���� n
		int sum;

		try {
//			�����̐��𔻒�
			if (args.length < 1) {
				throw new Exception("������1�ȏ���͂��Ă��������B");
			} else if (args.length > 2) {
				throw new Exception("������2�ɂ��Ă��������B");
			} else {
				m = Integer.parseInt(args[0]);
				n = Integer.parseInt(args[1]);
			}

//			�����̑召�𔻒�
			if (n < m) {
				int tmp;
				tmp = n;
				n = m;
				m = tmp;
			}

			for (int i = m; i <=n; i++) {

			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("�G���[:" + e.getMessage());
		}

	}
}
