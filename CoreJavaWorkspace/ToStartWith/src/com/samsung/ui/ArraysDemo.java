package com.samsung.ui;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		int[] arr = {10,20,30,50,40,60};
		// String str = Arrays.toString(arr);
		// System.out.println(str);
		
		int[] arr2 = {10,20,30,50,40,60};
		// String str2 = Arrays.toString(arr2);
		// System.out.println(str2);
		
		
		// System.out.println(str.equals(str2));
		System.out.println(Arrays.equals(arr, arr2));
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		int index = Arrays.binarySearch(arr, 300);
		if (index < 0) 
			System.out.println("not found");
		else
			System.out.println("found at index " + index);
	}

}
