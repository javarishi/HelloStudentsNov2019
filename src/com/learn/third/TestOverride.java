package com.learn.third;

public class TestOverride {

	public static void main(String[] args) {
		// Reference of SuperClass - instance of SubClass
		SuperClass superClass = new SubClass();
		superClass.checkSuperMethod();
		// Visibility of method comes from Reference type
		// Execution of method comes from instance type
		superClass.simpleMethod();
		
		

	}

}
