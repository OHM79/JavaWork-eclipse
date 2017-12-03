/*
    �N���X��        �FAccountDetail
    �\�[�X�t�@�C�����FAccountDetail.java
    ���쌠�\��      �FCopyright 2013 Fujitsu Kyushu Systems Limited
*/

package com.fjqs.java.labs.chap4;

public class AccountDetail {

    private String accountNo;       // �����ԍ�
    private String brandNo;         // �����ԍ�
    private int    equityHoldings;  // �ۗL����
    private int    purchaseAmount;  // ���t�z
    
    // �R���X�g���N�^
    public AccountDetail() {
    }
    
    public AccountDetail(String accountNo, String brandNo, int equityHoldings, int purchaseAmount) {
        this.accountNo      = accountNo;
        this.brandNo        = brandNo;
        this.equityHoldings = equityHoldings;
        this.purchaseAmount = purchaseAmount;
    }

    // �Q�b�^�[
    public String getAccountNo() {
        return accountNo;
    }
    public String getBrandNo() {
        return brandNo;
    }
    public int getEquityHoldings() {
        return equityHoldings;
    }
    public int getPurchaseAmount() {
        return purchaseAmount;
    }

    // �Z�b�^�[
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }
    public void setBrandNo(String brandNo) {
        this.brandNo = brandNo;
    }
    public void setEquityHoldings(int equityHoldings) {
        this.equityHoldings = equityHoldings;
    }
    public void setPurchaseAmount(int purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }
}
