package com.samsung.ui;

import java.util.Scanner;

public class SingleArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no. of cells : ");
		int size = scan.nextInt();
		
		double[] arr = new double[size];
		
		System.out.println("Enter values ..");
		for(int i = 0; i < size; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println("Array (for) ...");
		for(int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("Array (enhanced for) ...");
		for(double data : arr) {
			System.out.println(data);
		}
		
		scan.close();
	}

}
