/*
    �N���X��        �FAccount
    �\�[�X�t�@�C�����FAccount.java
    ���쌠�\��      �FCopyright 2013 Fujitsu Kyushu Systems Limited
*/

package com.fjqs.java.labs.chap4;

import java.util.ArrayList;

public class Account {

    private String accountNo;       // �����ԍ�
    private String password;        // �p�X���[�h
    private String customerName;    // �ڋq��
    private int    balance;         // ���t�]��
    
    private ArrayList<AccountDetail> details;   // �������� (���K4 ���������p)
    
    // �R���X�g���N�^
    public Account() {
    }
    
    public Account(String accountNo, String password, String customerName, int balance) {
        this.accountNo     = accountNo;
        this.password      = password;
        this.customerName  = customerName;
        this.balance       = balance;
        
        this.details = new ArrayList<AccountDetail>();
    }
    
    // �Q�b�^�[
    public String getAccountNo() {
        return accountNo;
    }
    public String getPassword() {
        return password;
    }
    public String getCustomerName() {
        return customerName;
    }
    public int getBalance() {
        return balance;
    }

    public ArrayList<AccountDetail> getDetails() {
        return details;
    }
    
    // �Z�b�^�[
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setDetails(ArrayList<AccountDetail> details) {
        this.details = details;
    }
}
