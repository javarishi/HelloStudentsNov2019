package com.learn.third;

public class SuperClass {
	
	protected String superclassString = "To Check the Access in Sub Class";
	
	
	public SuperClass() {
		this("sampleParam"); // Calling same class Constructor
		System.out.println("SuperClass Constructor ");
	}

	public SuperClass(String overloaded) {
		System.out.println("SuperClass Constructor overloaded");
	}
	
	public void checkSuperMethod() {
		System.out.println("Super class method is accessible");
	}

	public void simpleMethod() {
		System.out.println("I am a Simple Method - SuperClass");
	}
}
