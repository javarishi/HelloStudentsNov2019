package com.learn.multithreading;

public class TheadRunner {

	public static void main(String[] args) {
		CalculatePercentile task = new CalculatePercentile();
		
		Thread threadOne = new Thread(task);
		Thread threadTwo = new Thread(task);
	//	Thread threadThree = new Thread(task);
		
		
		threadOne.setName("threadOne");
		//threadOne.setPriority(Thread.MAX_PRIORITY);
		threadTwo.setName("threadTwo");
		//threadTwo.setPriority(Thread.MIN_PRIORITY);
		//threadThree.setName("threadThree");
		//threadThree.setPriority(Thread.NORM_PRIORITY);
	//	threadThree.setDaemon(true);
		
		threadOne.start();
		threadTwo.start();
		System.out.println(threadOne.isAlive());
		 try {
			threadOne.join();
			threadTwo.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	//	threadThree.start();
		System.out.println("Done with Threads");
	}

}
