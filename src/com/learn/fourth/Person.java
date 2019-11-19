package com.learn.fourth;

public final class Person {
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public final void validateSSN(String ssn) {
		if(ssn.length() == 10) {
			System.out.println("Valid SSN provided");
		}
	}

	
}
