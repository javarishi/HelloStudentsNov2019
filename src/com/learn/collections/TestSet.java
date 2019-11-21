package com.learn.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("Milk");
		hashSet.add("Coca Cola");
		hashSet.add("Toothpaste");
		hashSet.add("Deoderent");
		
		
		
		System.out.println(hashSet);
		
		hashSet.remove("Toothpaste");
		
		System.out.println(hashSet);
		
		boolean isAdded = hashSet.add("Milk");
		if(!isAdded) {
			
			System.out.println("Duplicate Element Found, Cannot be added");
			System.out.println(hashSet);
		}
		
		// Iterate
		for(String eachItem : hashSet) {
			System.out.println(eachItem);
		}
		
		System.out.println("Size of Set :: " + hashSet.size());
		
		hashSet.clear();
		System.out.println(hashSet);
		
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		linkedHashSet.add("Milk");
		linkedHashSet.add("Coca Cola");
		linkedHashSet.add("Toothpaste");
		linkedHashSet.add("Deoderent");
		
		System.out.println("Linked Hash Set Magic :: " + linkedHashSet);
		
		
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("A");
		treeSet.add("C");
		treeSet.add("D");
		treeSet.add("B");
		
		if(treeSet.contains("A")) {
			System.out.println("Contains Example Successful");
		}
		
		System.out.println("TreeSet Magic :: " + treeSet);

	}

}
