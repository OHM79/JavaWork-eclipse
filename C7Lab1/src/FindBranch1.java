/*
 *   �N���X��        �FFindBranch1
 *   �\�[�X�t�@�C�����FFindBranch1.java
 *   ���쌠�\��      �FCopyright 2015 Fujitsu Kyushu Systems Limited
 */

import java.sql.*;

// �x�X��񌟍��N���X
public class FindBranch1 {

    public static void main(String args[]) {
    	
        // �h���C�o�N���X
        String driver = "com.mysql.jdbc.Driver";
        // �f�[�^�x�[�X��URL
        String url    = "jdbc:mysql://localhost:3306/fjqs_DB";
		// �f�[�^�x�[�X�̃��[�U
		String  user  = "root";
		// �p�X���[�h
		String  pass  = "password";
        
        Connection con = null;               // �R�l�N�V����
        Statement stmt = null;     			 // �X�e�[�g�����g
        ResultSet  res = null;               // ���ʃZ�b�g
        
        String code = "";            		 //�x�X�R�[�h
        if(args.length == 1) {
            code = args[0];
        }
        else {
            System.out.println("�x�X�R�[�h���w�肵�Ă�������");
            System.exit(-1);
        }
    	
        // �K�v�ȃf�[�^�x�[�X�A�N�Z�X�������L�q���Ă��������B
    	
    }
}
