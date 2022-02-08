package com.samsung.model;

public class Product {
	// data members (instance variables)
	private int id;
	private String name;
	private double price;
	
	// static data member (class variables)
	private static double tax;
	
	// static method
	public static void setTax(double ptax) {
		tax = ptax;
	}
	
	public void setId(int pid) {
		id = pid;
	}
	
	public void setName(String pname) {
		name = pname;
	}
	
	public void setPrice(double pprice) {
		price = pprice;
	}
	
	public static double getTax() {
		return tax;
	}
	
	static {
		tax = 10;
		System.out.println("in static block");
	}
	
	
}
