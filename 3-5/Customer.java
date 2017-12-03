/*
    �N���X��        �FCustomer
    �\�[�X�t�@�C�����FCustomer.java
    ���쌠�\��      �FCopyright 2011 Fujitsu Kyushu Systems Limited
*/

public class Customer {

    private String code;                // �ڋq�R�[�h
    private String name;                // �ڋq��
    private String address;             // �Z��
    private String tel;                 // �d�b�ԍ�
    
    // �R���X�g���N�^
    public Customer(String code, String name, String address,
                    String tel) {
        this.code    = code;
        this.name    = name;
        this.address = address;
        this.tel     = tel;
    }
    
    // ���\��
    public void print() {
        System.out.println("�ڋq�R�[�h�@�@�F" + code);
        System.out.println("�ڋq���@�@�@�@�F" + name);
        System.out.println("�Z���@�@�@�@�@�F" + address);
        System.out.println("�d�b�ԍ��@�@�@�F" + tel);
    }
    
    // �Q�b�^�[
    public String getCode() {
        return code;
    }
    
    public String getName() {
        return name;
    }
    
    public String getAddress() {
        return address;
    }
    
    public String getTel() {
        return tel;
    }
    
}
