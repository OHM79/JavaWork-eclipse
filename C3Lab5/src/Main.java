/*
 *   �N���X��        �FMain
 *   �\�[�X�t�@�C�����FMain.java
 *   ���쌠�\��      �FCopyright 2015 Fujitsu Kyushu Systems Limited
 */

import com.fjqs.java.labs.chap3.Constellation;

// ���C���N���X
public class Main {

    public static void main(String args[]) {
        if(args.length != 2) {
            System.out.println("�����̒a�����ƁA����̒a������"
                             + "'mm/dd'�̌`�œ��͂��Ă��������B");
            System.exit(-1);
        }
        
        // Constellation�C���X�^���X����
        Constellation cons = new Constellation(args[0], args[1]);
        
        // �f�f���ʂ̕\��
        cons.printConstellation();
    }
}

