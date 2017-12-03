/*
 *   �N���X��        �FMain
 *   �\�[�X�t�@�C�����FMain.java
 *   ���쌠�\��      �FCopyright 2015 Fujitsu Kyushu Systems Limited
 */

import com.fjqs.java.labs.chap4.GoodsInterface;
import com.fjqs.java.labs.chap4.DairyProducts;
import com.fjqs.java.labs.chap4.Tableware;


// ���C���N���X
public class Main {
	
	public static void main(String args[]) {
		// �C���X�^���X�̐���
		GoodsInterface goods1 =
			new DairyProducts("����", "1���b�g��", 200, 7);
		GoodsInterface goods2 = new Tableware("���M", "���퐻", 500);
		
		// ��������
		goods1.order(5);
		goods2.order(2);
		
		// ���̕\��
		System.out.println("�������");
		goods1.display();
		System.out.println("------------------------------");
		goods2.display();
	}
}

