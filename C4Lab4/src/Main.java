/*
 *   �N���X��        �FMain
 *   �\�[�X�t�@�C�����FMain.java
 *   ���쌠�\��      �FCopyright 2015 Fujitsu Kyushu Systems Limited
 */

import com.fjqs.java.labs.chap4.StudentInterface;
import com.fjqs.java.labs.chap4.Student;
import com.fjqs.java.labs.chap4.LaborStudent;

public class Main {

    public static void main(String args[]) {
        // �C���X�^���X�̐���
        StudentInterface kenichi
            = new Student("�x�m�c����", "���Z 2 �N��");
        LaborStudent toshi
            = new LaborStudent("�x�m�c�q��", "��w 3 �N��",
                               "�ƒ닳�t", 800000);
        // ����\��
        kenichi.printName();
        kenichi.printGrade();
        System.out.println("------------------------------------");
        toshi.printName();
        toshi.printGrade();
        toshi.printDescription();
        toshi.printAnnualIncome();
        System.out.println("------------------------------------");
    }
}

