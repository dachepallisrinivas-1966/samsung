package com.samsung.ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		//	ArrayList obj = new ArrayList();				-- raw collection (not recommended)
		ArrayList<Integer> list = new ArrayList<>();		// generic collection - type-safe
		
		list.add(100);
		list.add(200);
		list.add(105);
		list.add(210);
		list.add(57);
		
		System.out.println(list);
		
		list.remove(1);			// index = 1
		
		System.out.println(list);
		
		list.set(0, 101);
		
		System.out.println(list);
		
		System.out.println("-------------------------------------");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("-------------------------------------");
		
		for(int data : list) {
			System.out.println(data);
		}
		
		System.out.println("-------------------------------------");
		
		System.out.println(list.contains(200));
		
		System.out.println("-------------------------------------");
		
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("-------------------------------------");
		
		ListIterator<Integer> lit = list.listIterator(2);
		while (lit.hasNext()) {
			System.out.println(lit.next());
		}
	
		System.out.println("-------------------------------------");
		
		System.out.println(list.indexOf(210));
		
		System.out.println("-------------------------------------");
		
		list.clear();
		System.out.println(list.isEmpty());
		
	}
}