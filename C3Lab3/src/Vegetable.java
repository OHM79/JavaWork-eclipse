/*
 *   クラス名        ：Vegetable
 *   ソースファイル名：Vegetable.java
 *   著作権表示      ：Copyright 2015 Fujitsu Kyushu Systems Limited
 */

// 野菜クラス
class Vegetable {

    String name;
    String unit;
    int price;
    int quantity;

    public Vegetable(String name,String unit,int price) {
        this.name = name;
        this.unit = unit;
        this.price = price;
    }

    public void order(int quantity) {
        this.quantity = quantity;
    }

    public void display() {
        System.out.println("品名   : " + this.name);
        System.out.println("単位   : " + this.unit);
        System.out.println("単価   : " + this.price);
        System.out.println("注文数 : " + this.quantity);
    }

    public void displayTotal() {
        int total = this.price * this.quantity;
        System.out.println("売上金額 : " + total);
    }

}

