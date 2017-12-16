/*
    クラス名        ：DispArray
    ソースファイル名：DispArray.java
    著作権表示      ：Copyright 2013 Fujitsu Kyushu Systems Limited
*/

public class DispArray {

    public static void main(String args[]) {
        // 販売データ
        int data[] = { 32, 27, 80, 120, 76, 18, 212, 320, 53, 44, 61, 420 };
        int soldItemsGraph = 0;
        // 必要な処理を記述し、DispArrayクラスを作成してください。
        for (int i = 0; i < data.length; i++) {
            //			System.out.println(data[i]);
            soldItemsGraph = (int) Math.round(data[i] / 10.0);
            //			System.out.println(soldItemsGraph);
            System.out.print(i + 1 + "月\t|");
            for (int j = 0; j < soldItemsGraph; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
