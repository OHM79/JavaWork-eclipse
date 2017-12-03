/*
    クラス名        ：Controller
    ソースファイル名：Controller.java
    著作権表示      ：Copyright 2013 Fujitsu Kyushu Systems Limited
*/

public class Controller {

    public static void main(String args[]) {
        CustomerList list = new CustomerList();
        
        list.add(new Corporation("0001", "有川工業",
                                 "福岡県福岡市博多区", "092-345-6789",
                                 "松田重", "製造業"));
        list.add(new Corporation("0002", "土田建設",
                                 "福岡県福岡市中央区", "092-234-6745",
                                 "竹田清弘", "建設業"));
        list.add(new Corporation("0003", "渡辺電器商会",
                                 "福岡県福岡市早良区", "092-987-6789",
                                 "大田康之", "家電販売"));
        list.add(new Individual("0004", "磐田雅夫",
                                "福岡県福岡市西区", "092-123-5678",
                                Individual.MARRIED,
                                Individual.MALE, "会社員"));
        list.add(new Individual("0005", "永田雅子",
                                "福岡県福岡市博多区",
                                "092-432-1928", Individual.UNMARRIED,
                                Individual.FEMALE, "学生"));
        
        list.print();
    }
    
}
