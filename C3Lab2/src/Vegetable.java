/*
 *   �N���X��        �FVegetable
 *   �\�[�X�t�@�C�����FVegetable.java
 *   ���쌠�\��      �FCopyright 2016 Fujitsu Kyushu Systems Limited
 */

// ��؃N���X
class Vegetable {

    static final double TAX = 0.08;
    String name;
    String unit;
    int price;
    int quantity;

    public void initialize(String name,String unit,int price) {
        this.name = name;
        this.unit = unit;
        this.price = price;
    }

    public void order(int quantity) {
        this.quantity = quantity;
    }

    public int getTotal() {
        return this.price * this.quantity;
    }

}

