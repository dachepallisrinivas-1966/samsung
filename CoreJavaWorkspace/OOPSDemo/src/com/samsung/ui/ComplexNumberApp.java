package com.samsung.ui;

import com.samsung.model.ComplexNumber;

public class ComplexNumberApp {

	public static void main(String[] args) {
		ComplexNumber first = new ComplexNumber(50);
		ComplexNumber second = new ComplexNumber(50);
		
		System.out.println(first == second);
		System.out.println(first.equals(second));
		
		//first.setRealPart(5);
		//first.setImaginaryPart(6);
		
		// System.out.println(first.getRealPart() + ", " + first.getImaginaryPart());
		
		// System.out.println(first);	// fully qualified class name @ hashcode-in-hexa decimal representation
		// System.out.println(first.toString());	// fully qualified class name @ hashcode-in-hexa decimal representation
		// System.out.println(first.hashCode());
		
		

	}

}
