/*
 *  �N���X��        �FMain
 *   �\�[�X�t�@�C�����FMain.java
 *   ���쌠�\��      �FCopyright 2015 Fujitsu Kyushu Systems Limited
 */

class Main {
    public static void main(String[] args) {
        Reservation res = new Reservation();
        res.check();
        res.reserv(4);
        res.cancel(2);
        res.check();
    }
}