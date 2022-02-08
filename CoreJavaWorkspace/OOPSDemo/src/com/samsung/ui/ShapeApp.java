package com.samsung.ui;


import com.samsung.model.Circle;
import com.samsung.model.Rectangle;
import com.samsung.model.Shape;


public class ShapeApp {

	public static void main(String[] args) {
	
		/* without polymorphism */
		Rectangle rectangle = new Rectangle(5,6);
		System.out.println(rectangle.getArea());
		
		Circle circle = new Circle(9);
		System.out.println(circle.getArea());
		
		/* using polymorphism */
		Shape shape;
		shape = new Rectangle(5,6);
		System.out.println(shape.getArea());
		shape = new Circle(9);
		System.out.println(shape.getArea());
	

	}

}