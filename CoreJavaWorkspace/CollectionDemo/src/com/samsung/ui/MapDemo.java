package com.samsung.ui;

import java.util.TreeMap;

public class MapDemo {
	public static void main(String[] args) {
		// HashMap<String, Integer> map = new HashMap<>();
		// LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		TreeMap<String, Integer> map = new TreeMap<>();
		map.put("oracle", 5000);
		map.put("c++", 4500);
		map.put("python", 4900);
		map.put("c++", 5100);
		// map.put(null, 100);
		map.put("andriod", null);
		
		
		for(String key : map.keySet()) {
			System.out.println(key + "\t" + map.get(key));
		}
		System.out.println("------------------------------------------------");
		
		map.remove("oracle");
		for(Integer value : map.values()) {
			System.out.println(value);
		}
		System.out.println("------------------------------------------------");
		
		System.out.println(map.containsKey("c++"));
		System.out.println(map.containsValue(5100));
		System.out.println("-------------------------------------------------");
		
//		Set<Entry<String,Integer>> entries =  map.entrySet();
//		for(Entry<String, Integer> entry : entries) {
//			System.out.println(entry.getKey() + "->" + entry.getValue());
//		}
//		System.out.println("-------------------------------------------------");
	}
}