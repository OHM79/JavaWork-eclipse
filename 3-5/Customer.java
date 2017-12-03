/*
    クラス名        ：Customer
    ソースファイル名：Customer.java
    著作権表示      ：Copyright 2011 Fujitsu Kyushu Systems Limited
*/

public class Customer {

    private String code;                // 顧客コード
    private String name;                // 顧客名
    private String address;             // 住所
    private String tel;                 // 電話番号
    
    // コンストラクタ
    public Customer(String code, String name, String address,
                    String tel) {
        this.code    = code;
        this.name    = name;
        this.address = address;
        this.tel     = tel;
    }
    
    // 情報表示
    public void print() {
        System.out.println("顧客コード　　：" + code);
        System.out.println("顧客名　　　　：" + name);
        System.out.println("住所　　　　　：" + address);
        System.out.println("電話番号　　　：" + tel);
    }
    
    // ゲッター
    public String getCode() {
        return code;
    }
    
    public String getName() {
        return name;
    }
    
    public String getAddress() {
        return address;
    }
    
    public String getTel() {
        return tel;
    }
    
}
