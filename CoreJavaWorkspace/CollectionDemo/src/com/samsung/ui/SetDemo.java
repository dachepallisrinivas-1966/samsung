package com.samsung.ui;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		HashSet<String> hset = new HashSet<>();
		hset.add("java");
		hset.add("oracle");
		hset.add("c++");
		hset.add("python");
		hset.add("oracle");
		hset.add(null);
		System.out.println(hset);

		for(String course : hset) {
			System.out.println(course);
		}
		
		LinkedHashSet<String> lhset = new LinkedHashSet<>();
		lhset.add("java");
		lhset.add("oracle");
		lhset.add("c++");
		lhset.add("python");
		lhset.add(null);
		System.out.println(lhset);
		
		TreeSet<String> tset = new TreeSet<>();
		tset.add("java");
		tset.add("oracle");
		tset.add("c++");
		tset.add("python");
		tset.add(null);
		System.out.println(tset);
		
		
	}

}