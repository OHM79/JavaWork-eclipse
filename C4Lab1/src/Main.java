/*
 *   �N���X��        �FMain
 *   �\�[�X�t�@�C�����FMain.java
 *   ���쌠�\��      �FCopyright 2015 Fujitsu Kyushu Systems Limited
 */

import com.fjqs.java.labs.chap4.Student;
import com.fjqs.java.labs.chap4.Employee;

public class Main {
	
	public static void main(String args[]) {
		// �C���X�^���X�̐���
		Student kenichi = new Student("�x�m�c����", 17, "���Z2�N��");
		Employee taro = new Employee("�c�����Y", 45, "���w���t");
		
		// ����\��
		System.out.println("------------------------------------");
		kenichi.print();
		System.out.println("------------------------------------");
		taro.print();
		System.out.println("------------------------------------");
	}
}

