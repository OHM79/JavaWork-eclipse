/*
    �N���X��        �FBrand
    �\�[�X�t�@�C�����FBrand.java
    ���쌠�\��      �FCopyright 2013 Fujitsu Kyushu Systems Limited
*/

package com.fjqs.java.labs.chap4;

public class Brand {

    private String number;          // �����ԍ�
    private String name;            // ����
    private int    presentPrice;    // ���ݒl
    
    // �R���X�g���N�^
    public Brand() {
    }
    
    public Brand(String number, String name, int presentPrice) {
        this.number       = number;
        this.name         = name;
        this.presentPrice = presentPrice;
    }
    
    // �Q�b�^�[
    public String getNumber() {
        return number;
    }
    public String getName() {
        return name;
    }
    public int getPresentPrice() {
        return presentPrice;
    }
    
    // �Z�b�^�[
    public void setNumber(String number) {
        this.number = number;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPresentPrice(int presentPrice) {
        this.presentPrice = presentPrice;
    }
}
