package com.learn.third;

public class SubClass extends SuperClass {
	
	public SubClass() {
		this("sampleOverload Child"); // Calling Parent class constructor
		System.out.println("SubClass Constructor");
	}

	public SubClass(String overload) {
		super(); // Calling Parent class constructor
		System.out.println("SubClass Constructor : overload");
	}
	
	public void subClassMethod(String param) {
		System.out.println("Sub Class Method is called :: " + param);
	}
	
	
	public void simpleMethod() {
		System.out.println("I am a Simple Method - SubClass");
	}
}
