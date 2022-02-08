package com.samsung.ui;

public class SplitDemo {

	public static void main(String[] args) {
		String str = "java is an object-oriented programming;language";
		String[] words = str.split("[; -]");
		for(String word : words) {
			System.out.println(word);
		}

	}

}
