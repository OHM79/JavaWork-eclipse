/*
 *   �N���X��        �FInsertBranch
 *   �\�[�X�t�@�C�����FInsertBranch.java
 *   ���쌠�\��      �FCopyright 2015 Fujitsu Kyushu Systems Limited
 */

import com.fjqs.java.labs.chap7.UserException;
import java.sql.*;

public class InsertBranch {

    public static void main(String args[]) {
    	
        // �h���C�o�N���X
        String driver = "com.mysql.jdbc.Driver";
        // �f�[�^�x�[�X��URL
        String url    = "jdbc:mysql://localhost:3306/fjqs_DB";
        // �f�[�^�x�[�X�̃��[�U
		String  user  = "root";
		// �p�X���[�h
		String  pass  = "password";

        Connection         con = null;      // �R�l�N�V����
        PreparedStatement stmt = null;      // �X�e�[�g�����g
        ResultSet          res = null;      // ���ʃZ�b�g

        // �x�X���
        String branchCode  = "";    		// �x�X�R�[�h
		String address     = "";			// �Z��
        String tel         = "";    		// �d�b�ԍ� 
        int    total       =  0;    		// ���z�B����
 
    	// �R�}���h���C������p�����^���擾
        if(args.length == 3) {
	    	branchCode    = args[0];
            address       = args[1];
            tel           = args[2];
		}
        else {
            System.out.println("�x�X�R�[�h�A�Z���A�d�b�ԍ�����͂��Ă�������");
            System.exit(-1);
        }

       // �K�v�ȃf�[�^�x�[�X�A�N�Z�X�������L�q���Ă��������B
    	
    }
}
