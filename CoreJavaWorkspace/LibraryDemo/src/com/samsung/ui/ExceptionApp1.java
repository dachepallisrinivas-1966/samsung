package com.samsung.ui;

public class ExceptionApp1 {

	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c;
			c = a+b;
			System.out.println("Sum = " + c);
			c = a-b;
			System.out.println("Difference = "+c);
			c = a*b;
			System.out.println("Product = "+c);
			try {
				c = a/b;
				System.out.println("Quotient = "+c);
				c = a%b;
				System.out.println("Remainder= "+c);
			} catch(ArithmeticException excep) {
				System.out.println("denominator cannot be 0 - cannot calculate quotient and remainder");
			}
		} catch(ArrayIndexOutOfBoundsException  excep) {
			System.err.println("please give 2 inputs using command line");
		} catch(NumberFormatException excep) {
			System.err.println("both the inputs must be integers only");
		} finally {
			System.out.println("exception processing is done");
		}

	}

}
