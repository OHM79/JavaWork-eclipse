/*
 *   クラス名        ：Main
 *   ソースファイル名：Main.java
 *   著作権表示      ：Copyright 2015 Fujitsu Kyushu Systems Limited
 */

import com.fjqs.java.labs.chap3.Constellation;

// メインクラス
public class Main {

    public static void main(String args[]) {
        if(args.length != 2) {
            System.out.println("自分の誕生日と、相手の誕生日を"
                             + "'mm/dd'の形で入力してください。");
            System.exit(-1);
        }
        
        // Constellationインスタンス生成
        Constellation cons = new Constellation(args[0], args[1]);
        
        // 診断結果の表示
        cons.printConstellation();
    }
}

