/*
 *   �N���X��        �FMain
 *   �\�[�X�t�@�C�����FMain.java
 *   ���쌠�\��      �FCopyright 2015 Fujitsu Kyushu Systems Limited
 */

// ���C���N���X
class Main {

    public static void main(String args[]) {

        // �C���X�^���X�̐���
        Vegetable spinach = new Vegetable("�ق����", "��", 200);

        // ��������
        spinach.order(5);

        // ���̕\��
        System.out.println("------------------------------");
        spinach.display();
        System.out.println("------------------------------");
        spinach.displayTotal();
        System.out.println("------------------------------");

    }
}

