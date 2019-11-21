package com.learn.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

public class TestMap {

	public static void main(String[] args) {
		HashMap<String, Integer> testMap = new HashMap<String, Integer>();
		
		// Sorts with key - SortedMap<K, V>
		
		
		testMap.put("A", 0);
		testMap.put("B", 2);
		testMap.put("C", 4);
		testMap.put("D", 6);
		testMap.put("E", 8);
		
		System.out.println(testMap);
		System.out.println(testMap.get("A"));
		
		System.out.println(testMap.remove("B"));
		System.out.println(testMap);
		
		if(testMap.containsKey("C")) {
			System.out.println("C Exists");
		}
		
		if(testMap.containsValue(10)) {
			System.out.println("10 Exists");
		}else {
			System.out.println("10 doesnt Exists");
		}
		
		String something = null;
		testMap.put(something, 10);
		System.out.println(testMap);
		
		Set<String> keySet = testMap.keySet();
		
		for(String eachKey : keySet) {
			System.out.println("Key :: " + eachKey + " Value :: " + testMap.get(eachKey));
		}
		
		Collection<Integer> values = testMap.values();
		for(int eachValue : values) {
			System.out.println(eachValue);
		}
		
		System.out.println("Size :: " + testMap.size());
		
		
	}

}
