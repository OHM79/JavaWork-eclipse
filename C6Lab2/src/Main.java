/*
 *   �N���X��        �FMain
 *   �\�[�X�t�@�C�����FMain.java
 *   ���쌠�\��      �FCopyright 2015 Fujitsu Kyushu Systems Limited
 */

import com.fjqs.java.labs.chap6.Calc;

// ���C���N���X
public class Main {
	
	public static void main(String args[]) {
		if(args.length != 3) {
			System.out.println("'java Main ���Z�q ���l1 ���l2'"
							 + "�̌`���Ŏ��s���Ă�������");
			System.exit(-1);
		}

	    // ��O�������L�q���Ă��������B
		
		String str  = args[0];
		int    num1 = Integer.parseInt(args[1]);
		int    num2 = Integer.parseInt(args[2]);
		
		if(str.equals("add")) {
			Calc.calcAddition(num1, num2);
		}
		else if(str.equals("sub")) {
			Calc.calcSubtraction(num1, num2);
		}
		else if(str.equals("mul")) {
			Calc.calcMultiplication(num1, num2);
		}
		else if(str.equals("div")) {
			Calc.calcDivision(num1, num2);
		}
		else {
			System.out.println("���Z�q�ɂ�" + 
					"'add', 'sub', 'mul', 'div'���w�肵�Ă�������");
			System.exit(-1);
		}
	}
}

