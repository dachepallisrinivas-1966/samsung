package com.samsung.ui;

import com.samsung.model.Product;

public class ProductApp {

	public static void main(String[] args) {
		// calling static method
		// Product.setTax(12);
		
		Product p1 = new Product();
		p1.setId(101);
		p1.setName("TV");
		p1.setPrice(16500.0);
		System.out.println(Product.getTax());
		

		
		Product p2 = new Product();
		p2.setId(102);
		p2.setName("MP3 Player");
		p1.setPrice(2400.0);
		System.out.println(Product.getTax());
		


	}

}
