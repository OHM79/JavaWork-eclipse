/*
 *   クラス名        ：Main
 *   ソースファイル名：Main.java
 *   著作権表示      ：Copyright 2015 Fujitsu Kyushu Systems Limited
 */

// メインクラス
class Main {

    public static void main(String args[]) {

        // インスタンスの生成
        Vegetable spinach = new Vegetable("ほうれん草", "束", 200);

        // 注文処理
        spinach.order(5);

        // 情報の表示
        System.out.println("------------------------------");
        spinach.display();
        System.out.println("------------------------------");
        spinach.displayTotal();
        System.out.println("------------------------------");

    }
}

