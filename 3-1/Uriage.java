/*
    �N���X��        �FUriage
    �\�[�X�t�@�C�����FUriage.java
    ���쌠�\��      �FCopyright 2013 Fujitsu Kyushu Systems Limited
*/

public class Uriage {

    private String salesNo;             // ����ԍ�
    private String date;                // �̔����t
    private String employee;            // �S���Җ�
    private int    totalAmount;         // ������z
    
    // �R���X�g���N�^
    public Uriage(String salesNo, String date, String employee,
                  int totalAmount) {
        this.salesNo     = salesNo;
        this.date        = date;
        this.employee    = employee;
        this.totalAmount = totalAmount;
    }
    
    // �Q�b�^�[
    public String getSalesNo() {
        return salesNo;
    }
    
    public String getDate() {
        return date;
    }
    
    public String getEmployee() {
        return employee;
    }
    
    public int getTotalAmount() {
        return totalAmount;
    }
    
}
