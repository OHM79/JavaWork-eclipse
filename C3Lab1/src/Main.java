/*
 *  クラス名        ：Main
 *   ソースファイル名：Main.java
 *   著作権表示      ：Copyright 2015 Fujitsu Kyushu Systems Limited
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