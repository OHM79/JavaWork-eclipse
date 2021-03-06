/*
 *   NXΌ        Fcom.fjqs.java.labs.chap4.Sale
 *   \[Xt@CΌFSale.java
 *   μ \¦      FCopyright 2015 Fujitsu Kyushu Systems Limited
 */

package com.fjqs.java.labs.chap4;

// ΜNX
public abstract class Sale {

	protected String goods; // €i
	protected int price; // PΏ
	protected int quantity; // Β
	protected int totalAmount; // vΰz
	protected int discount; // ψz
	protected int billed; // Ώz

	public Sale(String goods, int price) {
		this.goods = goods;
		this.price = price;
	}

	public void order(int quantity) {
		this.quantity = quantity;
		this.totalAmount = this.price * this.quantity;
	}

	public void display() {
		System.out.println("€i : " + this.goods);
		System.out.println("PΏ : " + this.price);
		System.out.println("Β : " + this.quantity);
		System.out.println("---------------------------------");
		System.out.println("ΰz : " + this.totalAmount);
	}

	public abstract void calcDiscount();

}
