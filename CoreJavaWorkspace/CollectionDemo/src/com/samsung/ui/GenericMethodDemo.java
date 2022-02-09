package com.samsung.ui;

class Util {
	public static<T> void swap(T first, T second) {
		T temp = first;
		first = second;
		second = temp;
	}
	public static<T> void show(T first, T second) {
		System.out.println(first + ", " + second);
	}
}
public class GenericMethodDemo {
	
	public static void main(String[] args) {
		Integer a = 5, b = 10;
		Util.<Integer>swap(a, b);
		Util.<Integer>show(a, b);
		
		Double c = 1.2, d = 3.4;
		Util.<Double>swap(c, d);
		Util.<Double>show(c, d);
	}

}
