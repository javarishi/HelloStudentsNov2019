package com.learn.multithreading;

import java.util.Calendar;

public class CalculatePercentile implements Runnable {

	
	@Override
	public void run() {
		// Task - addition of marks 
		// Calculate percentile
		System.out.println("Testing Yeild () :: " + Thread.currentThread().getName());
		Thread.yield();
		System.out.println("Testing Yeild () :: " + Thread.currentThread().getName());
		System.out.println("We are going to calculate Percentile here");
		for(int i=0; i <10; i++) {
			System.out.println("Value of i for "+ Thread.currentThread().getName() + " is " + i);
		}
		try {
			System.out.println("Testing Before Thread.sleep () :: " + Calendar.getInstance().getTime());
			Thread.sleep(5000);
			System.out.println("Testing After Thread.sleep ()  :: " + Calendar.getInstance().getTime());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		Thread.dumpStack();
	}

}
