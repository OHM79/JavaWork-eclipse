/*
 *   �N���X��        �FCatorDog
 *   �\�[�X�t�@�C�����FCatorDog.java
 *   ���쌠�\��      �FCopyright 2015 Fujitsu Kyushu Systems Limited
 */

// �y�b�g���L�҃J�E���g�N���X
class CatorDog {

    public static void main(String args[]) {

        // �y�b�g
        String pets[] = { "�L", "��", "�L", "�L", new String("�L"),
                "�L", "��", "��", "�L", new String("��") };
        int dogCount = 0;
        int catCount = 0;

        // �K�v�ȕϐ�����я������L�q���Ă��������B
        for (String pet : pets) {
            if (pet.equals("�L")) {
                //				System.out.println("�L");
                catCount++;
            } else if (pet.equals("��")) {
                dogCount++;
            } else {

            }
        }
        System.out.println("�L�������Ă���l��" + catCount + "�l�ł��B");
        System.out.println("���������Ă���l��" + dogCount + "�l�ł��B");
    }
}
