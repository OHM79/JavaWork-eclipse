/*
    �N���X��        �FController
    �\�[�X�t�@�C�����FController.java
    ���쌠�\��      �FCopyright 2013 Fujitsu Kyushu Systems Limited
*/

public class Controller {

    public static void main(String args[]) {
        CustomerList list = new CustomerList();
        
        list.add(new Corporation("0001", "�L��H��",
                                 "�����������s������", "092-345-6789",
                                 "���c�d", "������"));
        list.add(new Corporation("0002", "�y�c����",
                                 "�����������s������", "092-234-6745",
                                 "�|�c���O", "���݋�"));
        list.add(new Corporation("0003", "�n�ӓd�폤��",
                                 "�����������s���ǋ�", "092-987-6789",
                                 "��c�N�V", "�Ɠd�̔�"));
        list.add(new Individual("0004", "�֓c��v",
                                "�����������s����", "092-123-5678",
                                Individual.MARRIED,
                                Individual.MALE, "��Ј�"));
        list.add(new Individual("0005", "�i�c��q",
                                "�����������s������",
                                "092-432-1928", Individual.UNMARRIED,
                                Individual.FEMALE, "�w��"));
        
        list.print();
    }
    
}
