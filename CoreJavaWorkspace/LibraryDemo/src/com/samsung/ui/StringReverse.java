package com.samsung.ui;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter string : ");
		String str = scan.nextLine();
		
		String revString = "";
		for(int i = str.length()-1; i >= 0; i--) {
			revString += str.charAt(i);
		}
		
		System.out.println(revString);
		scan.close();
	}

}
