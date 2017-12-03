/*
    �N���X��        �FMain
    �\�[�X�t�@�C�����FMain.java
    ���쌠�\��      �FCopyright 2013 Fujitsu Kyushu Systems Limited
*/

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import com.fjqs.java.labs.chap4.Account;
import com.fjqs.java.labs.chap4.AccountDAO;
import com.fjqs.java.labs.chap4.ConnectionManager;

public class Main {

    public static void main(String args[]) {
        
        ArrayList<Account> accounts = null;         // �ڋq�ꗗ
        Account            account  = null;         // �w��ڋq
        
        Connection con = null;
        
        try {
            // �R�l�N�V�����擾
            ConnectionManager cm = ConnectionManager.getInstance();
            con = cm.getConnection();

            // �f�[�^�x�[�X��������
            AccountDAO aDao = new AccountDAO(con);

            if(args.length==0) {    // �ڋq�ꗗ����
                accounts = aDao.findAll();
            }else {                 // �w��ڋq����
                account  = aDao.findAccount(args[0]);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        //�\������
        if(args.length==0) { 
            Iterator<Account> it = accounts.iterator();
            System.out.println("�ڋq�ꗗ");
            System.out.println("=========================================================");
            System.out.println("�����ԍ�\t�p�X���[�h\t�ڋq��\t\t���t�]��");
            System.out.println("=========================================================");
            while (it.hasNext()) {
                Account ac = it.next();
                System.out.print(ac.getAccountNo() + "\t\t");
                System.out.print(ac.getPassword() + "\t\t");
                System.out.print(ac.getCustomerName() + "\t");
                System.out.println(ac.getBalance());
            }
            System.out.println();
        } else {
            System.out.println("�w��ڋq�\��");
            System.out.println("=========================================================");
            System.out.println("�����ԍ�\t�p�X���[�h\t�ڋq��\t\t���t�]��");
            System.out.println("=========================================================");
            if(account!=null){
                System.out.print(account.getAccountNo() + "\t\t");
                System.out.print(account.getPassword() + "\t\t");
                System.out.print(account.getCustomerName() + "\t");
                System.out.println(account.getBalance());
            }else{
                System.out.print("�Y�����R�[�h�����݂��܂���B");
            }
        }
        System.out.println();
    }
}
