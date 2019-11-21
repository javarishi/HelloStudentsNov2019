package com.learn.collections;

import java.util.ArrayList;
import java.util.List;

public class TestList  {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("A");
		arrayList.add(1, "B");
		arrayList.add(2, "C");
		
		System.out.println(arrayList);
		arrayList.add(2, "D");
		System.out.println(arrayList);
		
	
		//arrayList.sort(c);
		arrayList.add(arrayList.size(), "J");
		System.out.println(arrayList);
		
		// get an element from list
		String element= arrayList.get(0);
		System.out.println(element);
		
		List<String> sectionList = arrayList.subList(0, 3);
		
		System.out.println(sectionList);
		// iteration
		for(String eachItem : arrayList) {
			System.out.println(eachItem);
		}
		
		// contains
		if(arrayList.contains("A")) {
			System.out.println("List contains A");
		}
		
		// contailsAll
		if(arrayList.containsAll(sectionList)) {
			System.out.println("List contains all elements of sectionList");
		}
		
		// remove - you can remove by index or element in List
		arrayList.remove(0); // remove element at index 0
		arrayList.remove("B"); // remove element itself
		
		ArrayList<String> newList = new ArrayList<String>();
		newList.add("D");
		
		// removeAll
		arrayList.removeAll(newList); // removes all common elements in arrayList and Sectionlist 
		
		
		// retainAll
		arrayList.retainAll(sectionList); // retains all common elements in arrayList and Sectionlist
	}



}
