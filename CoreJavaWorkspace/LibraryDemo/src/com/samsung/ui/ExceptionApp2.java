package com.samsung.ui;

public class ExceptionApp2 {

	public static void main(String[] args) {
		
		if (args.length != 2) {
			System.out.println("please input two numbers using command line");
			System.exit(0);
		}
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c;
		c = a + b;
		System.out.println("Sum = " + c);
		c = a - b;
		System.out.println("Difference = " + c);
		c = a * b;
		System.out.println("Product = " + c);
		
		if (b != 0) {
			c = a / b;
			System.out.println("Quotient = " + c);
			c = a % b;
			System.out.println("Remainder= " + c);
		} else {
			System.out.println("cannot find quotient and remainder - denominator cannot be zero");
		}

	}

}
