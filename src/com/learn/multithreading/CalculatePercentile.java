package com.learn.multithreading;

import java.util.Calendar;

public class CalculatePercentile implements Runnable {
	
	
	String threadName = null;
	
	public CalculatePercentile(String threadName) {
		this.threadName = threadName;
	}
	
	public CalculatePercentile() {
		this.threadName = "Default";
	}

	
	@Override
	public void run() {
		// Task - addition of marks 
		// Calculate percentile
	
	/*	System.out.println("Testing Yeild () :: " + Thread.currentThread().getName());
		Thread.yield();
		System.out.println("Testing Yeild () :: " + Thread.currentThread().getName());
		System.out.println("We are going to calculate Percentile here"); */
		for(int i=0; i <10; i++) {
			System.out.println("Value of i for "+ Thread.currentThread().getName() + " is " + i + "  " + this.threadName);
		}
		
		//openFile();
		/*try {
			System.out.println("Testing Before Thread.sleep () :: " + Calendar.getInstance().getTime());
			Thread.sleep(5000);
			System.out.println("Testing After Thread.sleep ()  :: " + Calendar.getInstance().getTime());
		} catch (Throwable e) {
			e.printStackTrace();
		}*/
		//Thread.dumpStack();
	}
	
	
	public void openFile() {
		System.out.println("Multi threading allowed block");
		
		synchronized(this) {
			// Have some logic to open the file
			System.out.println("File is being opened");
		}
		
		System.out.println("You may allow this logic for multi threading");
	}
	
	
	
	
	
	
	
	
	
	
	

}
