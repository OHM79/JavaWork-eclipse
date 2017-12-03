/*
 *   クラス名        ：Shop
 *   ソースファイル名：Shop.java
 *   著作権表示      ：Copyright 2015 Fujitsu Kyushu Systems Limited
 */

// Shopクラスをパッケージ化してください。

// 店クラス
public class Shop {
	
	private Vegetable list[];		// 取り扱い商品
	
	// 初期化する
	public Shop() {
		list = new Vegetable[4];
		
		list[0] = new Vegetable("トマト", "pac", 250, 10);
		list[1] = new Vegetable("なす", "pac", 300, 12);
		list[2] = new Vegetable("大根", "本", 150, 7);
		list[3] = new Vegetable("レタス", "玉", 200, 5);
	}
	
	// 購入する
	public void buy(String name, int quantity) {
		Vegetable goods = null;
		
		// 商品検索
		for(Vegetable veg : list) {
			if(name.equals(veg.getName())) {
				goods = veg;
				break;
			}
		}
		
		if(goods != null) {
			if(goods.getStock() == 0){
				System.out.println("申し訳ありません。" + name
								 + "は売り切れ中です。");
			}
			else if(goods.getStock() < quantity) {
				System.out.println("申し訳ありません。" + name
								 + "は在庫が足りません。");
			}
			else {
				goods.setStock(goods.getStock() - quantity);
				System.out.println("ありがとうございます。代金は"
				+ (goods.getPrice() * quantity) + "円です。");
			}
		}
		else {
			System.out.println("申し訳ありません。" + name
							 + "は、扱っておりません。");
		}
	}
}

