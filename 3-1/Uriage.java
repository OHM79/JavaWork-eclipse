/*
    クラス名        ：Uriage
    ソースファイル名：Uriage.java
    著作権表示      ：Copyright 2013 Fujitsu Kyushu Systems Limited
*/

public class Uriage {

    private String salesNo;             // 売上番号
    private String date;                // 販売日付
    private String employee;            // 担当者名
    private int    totalAmount;         // 売上金額
    
    // コンストラクタ
    public Uriage(String salesNo, String date, String employee,
                  int totalAmount) {
        this.salesNo     = salesNo;
        this.date        = date;
        this.employee    = employee;
        this.totalAmount = totalAmount;
    }
    
    // ゲッター
    public String getSalesNo() {
        return salesNo;
    }
    
    public String getDate() {
        return date;
    }
    
    public String getEmployee() {
        return employee;
    }
    
    public int getTotalAmount() {
        return totalAmount;
    }
    
}
