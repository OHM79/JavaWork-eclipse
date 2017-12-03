/*
 *   クラス名        ：com.fjqs.java.labs.chap3.Vegetable
 *   ソースファイル名：Vegetable.java
 *   著作権表示      ：Copyright 2015 Fujitsu Kyushu Systems Limited
 */

// 野菜クラスをパッケージ化してください。

// 野菜クラス
public class Vegetable {
	
	private String name;			// 品名
	private String unit;			// 単位
	private int    price;			// 単価
	private int    stock;			// 在庫
	
	// 初期化する
	public Vegetable(String pName, String pUnit,
								   int pPrice, int pStock) {
		name  = pName;
		unit  = pUnit;
		price = pPrice;
		stock = pStock;
	}
	
	// メンバ変数をメソッド呼び出し側に渡すメソッド
	public String getName() {
		return name;
	}
	
	public String getUnit() {
		return unit;
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getStock() {
		return stock;
	}
	
	// メンバ変数を設定するメソッド
	public void setName(String s) {
		name = s;
	}
	
	public void setUnit(String s) {
		unit = s;
	}
	
	public void setPrice(int i) {
		price = i;
	}
	
	public void setStock(int i) {
		stock = i;
	}
}

