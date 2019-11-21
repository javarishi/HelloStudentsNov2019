package com.learn.collections;

import java.util.PriorityQueue;

public class TestQueue {

	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<String>();
		PriorityQueue<String> empty = new PriorityQueue<String>();
		queue.add("A");
		queue.offer("B");
		queue.offer("C");
		queue.offer("D");
		queue.offer("E");
		
		System.out.println(queue.element());
		//System.out.println(empty.element());
		System.out.println(queue);
		
		System.out.println("queue.peek() :: " + queue.peek());
		System.out.println("empty.peek() :: " + empty.peek());
		System.out.println(queue);
		
		System.out.println("queue.remove() :: " + queue.remove());
		//System.out.println("empty.remove() :: " + empty.remove());
		System.out.println(queue);
		
		System.out.println("queue.poll() :: " + queue.poll());
		System.out.println("empty.poll() :: " + empty.poll());
		System.out.println(queue);
		
			
		

	}

}
