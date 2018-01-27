
/*
 *   �N���X��        �FMain
 *   �\�[�X�t�@�C�����FMain.java
 *   ���쌠�\��      �FCopyright 2015 Fujitsu Kyushu Systems Limited
 */

import com.fjqs.java.labs.chap4.OverTheCounter;
import com.fjqs.java.labs.chap4.MailOrder;
import com.fjqs.java.labs.chap4.Sale;

// ���C���N���X
public class Main {

	public static void main(String args[]) {

		Sale sales[] = new Sale[5]; // �̔�

		// �C���X�^���X�̐���
		sales[0] = new OverTheCounter("�g�}�g", 250);
		sales[1] = new OverTheCounter("���", 120);
		sales[2] = new OverTheCounter("���イ��", 80);
		sales[3] = new MailOrder("���", 120);
		sales[4] = new MailOrder("�Ԃǂ�", 470);

		// ��������
		sales[0].order(20);
		sales[1].order(15);
		sales[2].order(7);
		sales[3].order(12);
		sales[4].order(3);

		for (int i = 0; i < sales.length; i++) {
			sales[i].calcDiscount();
		}

		for (int i = 0; i < sales.length; i++) {
			sales[i].display();
		}

	}
}
