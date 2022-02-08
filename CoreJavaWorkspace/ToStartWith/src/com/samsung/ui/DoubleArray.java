package com.samsung.ui;

import java.util.Scanner;

public class DoubleArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter no. of rows : ");
		int rows = scan.nextInt();
		System.out.print("Enter no. of columns : ");
		int cols = scan.nextInt();
		
		int[][] darr = new int[rows][cols];
		int i, j;
		System.out.println("Enter values ...");
		for(i = 0; i < rows; i++) {
			for(j = 0; j < cols; j++) {
				darr[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("Double Array (for) ...");
		for(i = 0; i < rows; i++) {
			for(j = 0; j < cols; j++) {
				System.out.print(darr[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		System.out.println("Double Array (enhanced for) ...");
		for(int[] row : darr) {
			for(int data : row) {
				System.out.print(data + "\t");
			}
			System.out.println();
		}
		
		
		scan.close();
	}

}
