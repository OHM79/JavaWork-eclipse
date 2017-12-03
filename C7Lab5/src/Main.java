/*
 *   �N���X��        �FMain
 *   �\�[�X�t�@�C�����FMain.java
 *   ���쌠�\��      �FCopyright 2015 Fujitsu Kyushu Systems Limited
 */

import com.fjqs.java.labs.chap7.UserException;
import com.fjqs.java.labs.chap7.DBAccess;

import java.sql.*;
import java.util.*;

// ���C���N���X
public class Main {

    public static void main(String args[]) {

		// �h���C�o�}�l�[�W���N���X
		String DRIVER = "com.mysql.jdbc.Driver";
		// �f�[�^�x�[�X��URL
		String URL    = "jdbc:mysql://localhost:3306/fjqs_DB";
		// �f�[�^�x�[�X�̃��[�U
		String  user  = "root";
		// �p�X���[�h
		String  pass  = "password";
	
		Connection con = null;
    	DBAccess   dba = null;		// �f�[�^�x�[�X����
    	
    	String code  	  = "";		// �x�X�R�[�h
    	String aCode 	  = "";		// �n��R�[�h
    	int    orderNo    = 0;		// �`�[�ԍ�
    	
    	HashMap branch   = null;	// �x�X���
    	HashMap van      = null;	// �z���ԏ��
    	HashMap delivery = null;	// �z�B���
    	
        if(args.length == 1) {
        	try {
	            orderNo =Integer.parseInt(args[0]);
	        }
	        catch(NumberFormatException e) {
	        	System.out.println("�`�[�ԍ��͐�����"
	        					 + "�w�肵�Ă�������");
	        	System.exit(-1);
	        }
        }
        else {
            System.out.println("�`�[�ԍ����w�肵�Ă�������");
            System.exit(-1);
        }

		// �K�v�ȃf�[�^�x�[�X�A�N�Z�X�������L�q���Ă��������B
        
    }
}
