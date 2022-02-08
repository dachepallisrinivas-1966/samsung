package com.samsung.model;

public abstract class Shape {
	private double firstDimension;
	private double secondDimension;
	
	public Shape() {
		/* no implementation required */
	}
	
	public Shape(double firstDimension) {
		this.firstDimension = firstDimension;
		this.secondDimension = 0;
	}
	
	public Shape(double firstDimension, double secondDimension) {
		this.firstDimension = firstDimension;
		this.secondDimension = secondDimension;
	}
	
	public double getFirstDimension() {
		return firstDimension;
	}
	
	public double getSecondDimension() {
		return secondDimension;
	}
	
	public abstract double getArea();
}	