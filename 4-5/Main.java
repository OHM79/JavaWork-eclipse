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
import com.fjqs.java.labs.chap4.AccountDetail;
import com.fjqs.java.labs.chap4.AccountDetailDAO;
import com.fjqs.java.labs.chap4.Brand;
import com.fjqs.java.labs.chap4.BrandDAO;
import com.fjqs.java.labs.chap4.ConnectionManager;

public class Main {

    public static void main(String args[]) {
        Brand   brand   = null;         // �w������
        Account account = null;         // �w��ڋq
        int     equity  = 0;            // �w������
        int     amount  = 0;            // �w�����z
        
        Connection con = null;
        
        if(args.length!=3){
            System.out.println("�����ԍ��A�����ԍ��A�w����������͂��Ă�������");
            System.exit(1);
        } else {
            try {
                equity = Integer.parseInt(args[2]);
            } catch (NumberFormatException ex) {
                System.out.println("�w�������ɂ�0���傫����������͂��Ă�������");
                System.exit(1);
            }
        }
        // �ȉ��ɕK�v�ȏ������L�q���Ă��������B
    
    }
    
    // �w��ڋq�\���i���̃��\�b�h�͎��R�Ɏg�p���Ă悢�B�j
    public static void printAccount(Connection con, String accountNo) throws SQLException {
        
        Account account  = null;            // �w��ڋq
        
        // �f�[�^�x�[�X��������
        AccountDAO aDao = new AccountDAO(con);
        account = aDao.findAccountWithDetail(accountNo);
        
        //�\������
        System.out.println("�w��ڋq�\��");
        System.out.println("=========================================================");
        System.out.println("�����ԍ�\t�p�X���[�h\t�ڋq��\t\t���t�]��");
        System.out.println("=========================================================");
        if(account!=null){
            System.out.print(account.getAccountNo() + "\t\t");
            System.out.print(account.getPassword() + "\t\t");
            System.out.print(account.getCustomerName() + "\t");
            System.out.println(account.getBalance());
            System.out.println();

            ArrayList<AccountDetail> details = account.getDetails();
            if (details.size() != 0) {
                Iterator<AccountDetail> it = details.iterator();
                System.out.println("�������׈ꗗ");
                System.out.println("=========================================================");
                System.out.println("�����ԍ�\t�����ԍ�\t�ۗL����\t���t�z");
                System.out.println("=========================================================");
                while (it.hasNext()) {
                    AccountDetail ad = it.next();
                    System.out.print(ad.getAccountNo() + "\t\t");
                    System.out.print(ad.getBrandNo() + "\t\t");
                    System.out.print(ad.getEquityHoldings() + "\t\t");
                    System.out.println(ad.getPurchaseAmount());
                }
            }else{
                System.out.print("�������ׂ����݂��܂���B");
            }
        }else{
            System.out.print("�Y�����������݂��܂���B");
        }
        System.out.println();
    }
}
