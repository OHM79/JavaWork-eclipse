/*
 *   �N���X��        �Fcom.fjqs.java.labs.chap6.Calc
 *   �\�[�X�t�@�C�����FCalc.java
 *   ���쌠�\��      �FCopyright 2015 Fujitsu Kyushu Systems Limited
 */

package com.fjqs.java.labs.chap6;

// �l�����Z���s���N���X
public class Calc {

	// ���Z
	public static void calcAddition(int num1, int num2) {
		int ans = num1 + num2;
		System.out.println(num1 + " �{ " + num2 + " = " + ans);
	}
	// ���Z
	public static void calcSubtraction(int num1, int num2) {
		int ans = num1 - num2;
		System.out.println(num1 + " �| " + num2 + " = " + ans);
	}
	
	// �|�Z
	public static void calcMultiplication(int num1, int num2) {
		int ans = num1 * num2;
		System.out.println(num1 + " �~ " + num2 + " = " + ans);
	}
	
	// ���Z
	// ��O�������L�q���Ă��������B
	public static void calcDivision(int num1, int num2) {
		int ans = num1 / num2;
		System.out.println(num1 + " �� " + num2 + " = " + ans);
	}
}

