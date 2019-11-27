package com.learn.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorTest {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(10);
		CalculatePercentile calc = null;
		for(int i = 0; i < 20; i++) {
			calc = new CalculatePercentile("Thread Task " + i);
			executor.execute(calc);
		}

	}

}
