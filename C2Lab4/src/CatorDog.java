/*
 *   クラス名        ：CatorDog
 *   ソースファイル名：CatorDog.java
 *   著作権表示      ：Copyright 2015 Fujitsu Kyushu Systems Limited
 */

// ペット所有者カウントクラス
class CatorDog {

    public static void main(String args[]) {

        // ペット
        String pets[] = { "猫", "犬", "猫", "猫", new String("猫"),
                "猫", "犬", "犬", "猫", new String("犬") };
        int dogCount = 0;
        int catCount = 0;

        // 必要な変数および処理を記述してください。
        for (String pet : pets) {
            if (pet.equals("猫")) {
                //				System.out.println("猫");
                catCount++;
            } else if (pet.equals("犬")) {
                dogCount++;
            } else {

            }
        }
        System.out.println("猫を飼っている人は" + catCount + "人です。");
        System.out.println("犬を飼っている人は" + dogCount + "人です。");
    }
}
