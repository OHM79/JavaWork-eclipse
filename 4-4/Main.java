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
import com.fjqs.java.labs.chap4.ConnectionManager;

public class Main {

    public static void main(String args[]) {
        
        Account account = null;     // �w��ڋq
        Connection  con = null;
        
        try {
            // �R�l�N�V�����擾
            ConnectionManager cm = ConnectionManager.getInstance();
            con = cm.getConnection();

            // �f�[�^�x�[�X��������
            AccountDAO aDao = new AccountDAO(con);

            if(args.length==1) {    // �w��ڋq����
                account  = aDao.findAccountWithDetail(args[0]);
            } else {
                System.out.println("�����ԍ�����͂��Ă�������");
                System.exit(1);
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
        if(args.length==1) {
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
                System.out.print("�Y�����R�[�h�����݂��܂���B");
            }
        }
        System.out.println();
    }
}
