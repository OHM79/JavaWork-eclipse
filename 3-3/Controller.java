/*
    NXΌ        FController
    \[Xt@CΌFController.java
    μ \¦      FCopyright 2013 Fujitsu Kyushu Systems Limited
*/

public class Controller {

    public static void main(String args[]) {
        
        Customer list[] = new Customer[5];  // ΪqXg
        list[0] = new Corporation("0001", "LμHΖ",
                                  "ͺ§ͺs½ζ", "092-345-6789",
                                  "Όcd", "»’Ζ");
        list[1] = new Corporation("0002", "ycέ",
                                  "ͺ§ͺsζ", "092-234-6745",
                                  "|c΄O", "έΖ");
        list[2] = new Corporation("0003", "nΣdν€ο",
                                  "ͺ§ͺsΗζ", "092-987-6789",
                                  "εcNV", "ΖdΜ");
        list[3] = new Individual("0004", "Φcλv",
                                 "ͺ§ͺsΌζ", "092-123-5678",
                                 Individual.MARRIED,
                                 Individual.MALE, "οΠυ");
        list[4] = new Individual("0005", "icλq",
                                 "ͺ§ͺs½ζ",
                                 "092-432-1928", Individual.UNMARRIED,
                                 Individual.FEMALE, "wΆ");
        
        System.out.println("Ϊqκ");
        for (int i=0; i<list.length; i++) {
            System.out.println("--------------------------------");
            list[i].print();
            System.out.println("--------------------------------");
        }
    }
}
