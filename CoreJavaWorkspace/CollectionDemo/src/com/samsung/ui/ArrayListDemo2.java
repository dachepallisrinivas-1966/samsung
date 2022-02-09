package com.samsung.ui;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();	
		// LinkedList<Integer> list = new LinkedList<>();
		list.add(100);
		list.add(200);
		list.add(105);
		list.add(210);
		list.add(57);
		
		System.out.println(list);
		System.out.println("-------------------------------");
		
		Collections.sort(list);
		System.out.println(list);
		
	}
}