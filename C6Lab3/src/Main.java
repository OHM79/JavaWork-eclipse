/*
 *   �N���X��        �FMain
 *   �\�[�X�t�@�C�����FMain.java
 *   ���쌠�\��      �FCopyright 2015 Fujitsu Kyushu Systems Limited
 */

import com.fjqs.java.labs.chap6.VegetableList;
import com.fjqs.java.labs.chap6.NotFoundException;

public class Main {
	
	public static void main(String args[]) {
		if(args.length < 1) {
			System.out.println("���i�R�[�h����͂��Ă�������");
			System.exit(-1);
		}
		
		// �C���X�^���X�̐���
		VegetableList list = new VegetableList();
		
		// ���̕\��
		try {
			if(args.length == 1) {
				list.search(args[0]);
			}
			else {
				list.search(args);
			}
		}
		catch(NotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
