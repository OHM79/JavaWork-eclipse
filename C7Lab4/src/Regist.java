/*
 *   �N���X��        �FRegist
 *   �\�[�X�t�@�C�����FRegist.java
 *   ���쌠�\��      �FCopyright 2015 Fujitsu Kyushu Systems Limited
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;

public class Regist {

    public static void main(String args[]) {
    	
        // �h���C�o�N���X
        String driver  = "com.mysql.jdbc.Driver";
        // �f�[�^�x�[�X��URL
        String url     = "jdbc:mysql://localhost:3306/fjqs_DB";
		// �f�[�^�x�[�X�̃��[�U
		String  user   = "root";
		// �p�X���[�h
		String  pass   = "password";
        
        Connection 			con = null;      // �R�l�N�V����
        PreparedStatement  stmt = null;      // �X�e�[�g�����g
        ResultSet  			res = null;      // ���ʃZ�b�g
        
        // ���t���
        Calendar cal = Calendar.getInstance();
        java.sql.Date date
        	= new java.sql.Date(cal.getTime().getTime());
        
        // �x�X���
        String code       = "";             // �x�X�R�[�h
        int    total      =  0;				// ���z�B����
        
        // �z���ԏ��
        String areaCode   = "";             // �n��R�[�h
        int    undelivery =  0;				// �z���ԏ��
        
        // �z�B���
        int    orderNo  =  1;				// �ԍ�
        String sName    = "";				// ���o�l���O
        String sAddress = "";				// ���o�l�Z��
        String rName    = "";				// ���l���O
        String rAddress = "";				// ���l�Z��
        java.sql.Date orderDate = date;
        
        if(args.length == 5) {
            areaCode = args[0];
            sName    = args[1];
            sAddress = args[2];
            rName    = args[3];
            rAddress = args[4];
        }
        else {
        	System.out.println("�n��R�[�h�A���o�l�����A���o�l�Z���A"
            	       + "���l�����A���l�Z�����w�肵�Ă�������");
            System.exit(-1);
        }

		// �K�v�ȃf�[�^�x�[�X�A�N�Z�X�������L�q���Ă��������B
  
    }
}
