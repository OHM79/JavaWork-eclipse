/*
    �N���X��        �FMain
    �\�[�X�t�@�C�����FMain.java
    ���쌠�\��      �FCopyright 2013 Fujitsu Kyushu Systems Limited
*/

public class Main {

    public static void main(String args[]) {
        // ���㐬�уf�[�^
        Uriage list[] = new Uriage[10];
        list[0] = new Uriage("0401", "2004/04/01", "����_�j", 200);
        list[1] = new Uriage("0402", "2004/04/03", "�đ����q", 200);
        list[2] = new Uriage("0403", "2004/04/06", "����_�j", 400);
        list[3] = new Uriage("0404", "2004/04/07", "�͖쐳��", 100);
        list[4] = new Uriage("0405", "2004/04/07", "���ی��u", 200);
        list[5] = new Uriage("0406", "2004/04/12", "���ی��u", 300);
        list[6] = new Uriage("0407", "2004/04/15", "����_�j", 200);
        list[7] = new Uriage("0408", "2004/04/16", "�đ����q", 400);
        list[8] = new Uriage("0409", "2004/04/21", "�đ����q", 200);
        list[9] = new Uriage("0410", "2004/04/23", "�đ����q", 200);

        // �S���ҕʔ��㐬�уf�[�^
        PersonalSales persons[] = new PersonalSales[4];
        persons[0] = new PersonalSales("����_�j",0);
        persons[1] = new PersonalSales("�đ����q",0);
        persons[2] = new PersonalSales("�͖쐳��",0);
        persons[3] = new PersonalSales("���ی��u",0);
        
        // �W�v�������L�q���Ă��������B
        
    }
}
