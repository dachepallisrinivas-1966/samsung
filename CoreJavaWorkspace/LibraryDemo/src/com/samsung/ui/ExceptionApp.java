package com.samsung.ui;

public class ExceptionApp {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c;
		c = a + b;
		System.out.println("Sum = " + c);
		c = a - b;
		System.out.println("Difference = " + c);
		c = a * b;
		System.out.println("Product = " + c);
		c = a / b;
		System.out.println("Quotient = " + c);
		c = a % b;
		System.out.println("Remainder = " + c);
		System.out.println("end of program");
	}

}
