package com.samsung.ui;

public class FunctionDemo {

	static int factorial(int num) {
		int fact = 1;
		for(int i = num; i >= 2; i--) {
			fact *= i;
		}
		return fact;
	}
	
	static int factorial2(int num) {
		if (num == 0)
			return 1;
		
		return num*factorial(num-1);
	}
	
	static int[] minMax(int[] arr) {
		int min, max;
		min = max = arr[0];
		for(int data : arr) {
			if (data > max) 
				max = data;
			if (data < min)
				min = data;
		}
		return new int[] {min, max};
	}
	
	public static void main(String[] args) {
		System.out.println(factorial(5));
		System.out.println(factorial2(5));
		int[] arr = {10,5,15,20,17};
		int[] result = minMax(arr);
		System.out.println("Min = " + result[0] + "\tMax = " + result[1]);

	}

}
