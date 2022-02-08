package com.samsung.model;

public class ComplexNumber {
	
	// data members (or) properties
	private double realPart;
	private double imaginaryPart;
	
	public ComplexNumber(double realPart) {
		this.realPart = this.imaginaryPart = realPart;
	}
	
	public void setRealPart(double realPart) {
		this.realPart = realPart;
	}
	
	public void setImaginaryPart(double imaginaryPart) {
		this.imaginaryPart = imaginaryPart;
	}
	
	public double getRealPart() {
		return realPart;
	}
	
	public double getImaginaryPart() {
		return imaginaryPart;
	}
	
}
 