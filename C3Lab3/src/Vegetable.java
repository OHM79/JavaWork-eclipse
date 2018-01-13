/*
 *   �N���X��        �FVegetable
 *   �\�[�X�t�@�C�����FVegetable.java
 *   ���쌠�\��      �FCopyright 2015 Fujitsu Kyushu Systems Limited
 */

// ��؃N���X
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
        System.out.println("�i��   : " + this.name);
        System.out.println("�P��   : " + this.unit);
        System.out.println("�P��   : " + this.price);
        System.out.println("������ : " + this.quantity);
    }

    public void displayTotal() {
        int total = this.price * this.quantity;
        System.out.println("������z : " + total);
    }

}

