/*
 *   �N���X��        �FFindBranch2
 *   �\�[�X�t�@�C�����FFindBranch2.java
 *   ���쌠�\��      �FCopyright 2015 Fujitsu Kyushu Systems Limited
 */

import java.sql.*;

// �x�X�E�z���Ԍ����N���X
public class FindBranch2 {

    public static void main(String args[]) {
    	
        // �h���C�o�N���X
        String driver = "com.mysql.jdbc.Driver";
        // �f�[�^�x�[�X��URL
        String url    = "jdbc:mysql://localhost:3306/fjqs_DB";
		// �f�[�^�x�[�X�̃��[�U
		String  user  = "root";
		// �p�X���[�h
		String  pass  = "password";
        
        Connection         con   = null;      // �R�l�N�V����
        PreparedStatement  stmt1 = null;      // �X�e�[�g�����g�i�x�X�p�j
        PreparedStatement  stmt2 = null;      // �X�e�[�g�����g�i�z���ԗp�j
        ResultSet          res1  = null;      // ���ʃZ�b�g�i�x�X�p�j
        ResultSet          res2  = null;      // ���ʃZ�b�g�i�z���ԗp�j
        
        String code = "";            		  //�x�X�R�[�h
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