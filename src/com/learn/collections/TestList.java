package com.learn.collections;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("A");
		arrayList.add(1, "B");
		arrayList.add(2, "C");
		
		System.out.println(arrayList);
		arrayList.add(2, "D");
		System.out.println(arrayList);
		
		arrayList.add(arrayList.size(), "J");
		System.out.println(arrayList);
		
		// get an element from list
		String element= arrayList.get(0);
		System.out.println(element);
		
		List<String> sectionList = arrayList.subList(0, 3);
		
		System.out.println(sectionList);
		// iteration
		
		
		// contains
		
		// contailsAll
		
		
		// remove
		
		
		// removeAll
		
		
		// retainAll

	}

}
