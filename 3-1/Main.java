/*
    クラス名        ：Main
    ソースファイル名：Main.java
    著作権表示      ：Copyright 2013 Fujitsu Kyushu Systems Limited
*/

public class Main {

    public static void main(String args[]) {
        // 売上成績データ
        Uriage list[] = new Uriage[10];
        list[0] = new Uriage("0401", "2004/04/01", "藤沢浩史", 200);
        list[1] = new Uriage("0402", "2004/04/03", "米村聡子", 200);
        list[2] = new Uriage("0403", "2004/04/06", "藤沢浩史", 400);
        list[3] = new Uriage("0404", "2004/04/07", "河野正治", 100);
        list[4] = new Uriage("0405", "2004/04/07", "武保厚志", 200);
        list[5] = new Uriage("0406", "2004/04/12", "武保厚志", 300);
        list[6] = new Uriage("0407", "2004/04/15", "藤沢浩史", 200);
        list[7] = new Uriage("0408", "2004/04/16", "米村聡子", 400);
        list[8] = new Uriage("0409", "2004/04/21", "米村聡子", 200);
        list[9] = new Uriage("0410", "2004/04/23", "米村聡子", 200);

        // 担当者別売上成績データ
        PersonalSales persons[] = new PersonalSales[4];
        persons[0] = new PersonalSales("藤沢浩史",0);
        persons[1] = new PersonalSales("米村聡子",0);
        persons[2] = new PersonalSales("河野正治",0);
        persons[3] = new PersonalSales("武保厚志",0);
        
        // 集計処理を記述してください。
        
    }
}
