package com.samsung.ui;

public class VarArgsDemo {

	static double average(int ... nums) {
		int sum = 0;
		for(int data : nums) {
			sum += data;
		}
		return (double)sum / nums.length;
	}
	
	public static void main(String[] args) {
		System.out.println(average(1,2,3,4,5,6));
		System.out.println(average(1,2,3,4,5));
		System.out.println(average(1,2,3,4));
		System.out.println(average(1,2,3));
		System.out.println(average(1,2));

	}

}
