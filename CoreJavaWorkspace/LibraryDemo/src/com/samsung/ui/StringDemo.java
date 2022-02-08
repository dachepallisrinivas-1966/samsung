package com.samsung.ui;

public class StringDemo {

	public static void main(String[] args) {
		String str = "java";
		String str2 = "java";
		
		System.out.println(str == str2);
		System.out.println(str.equals(str2));

		
		String str3 = new String("java");
		String str4 = new String("java");
		
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
		
		String str5 = "cat";
		String str6 = "cot";
		System.out.println(str5.compareTo(str6));
		
		
		
		
	}

}
