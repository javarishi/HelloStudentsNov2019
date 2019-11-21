package com.learn.collections;

import java.util.ArrayDeque;

public class TestDeque {

	public static void main(String[] args) {
		ArrayDeque<String> deque = new ArrayDeque<String>();
		
		deque.offer("A");
		deque.offerFirst("B");
		deque.offerLast("C");
		
		System.out.println(deque);
		
		// try all methods with First and Last - same as queue

	}

}
