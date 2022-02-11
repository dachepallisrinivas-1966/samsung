package com.samsung.model;

import java.io.Serializable;

public class Book implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer bookCode;
	private String title;
	private double price;
	private String category;

	public Book() {
		/* default constructor */
	}
	public Book(Integer bookCode, String title, double price, String category) {
		this.bookCode = bookCode;
		this.title = title;
		this.price = price;
		this.category = category;
	}
	public Integer getBookCode() {
		return bookCode;
	}
	public void setBookCode(Integer bookCode) {
		this.bookCode = bookCode;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return String.format("bookCode=%s, title=%s, price=%s, category=%s", bookCode, title, price, category);
	}
	
}
