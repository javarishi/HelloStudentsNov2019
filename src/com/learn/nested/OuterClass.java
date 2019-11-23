package com.learn.nested;

import com.learn.fourth.Customer;

public class OuterClass {
	
	public String publicOuterVarible = "Public Outer Variable";
	private String privateOuterVarible = "Private Outer Variable";
	public static String publicStaticOuterVarible = "Public Static Outer Variable";
	private static String privateStaticOuterVarible = "Private Static Outer Variable";

	public OuterClass() {
		System.out.println("Outer Class Constructor");
	}
	
	public void outerClassMethod() {
		System.out.println("OuterClass Method");
	}
	
	public static void outerStaticMethod() {
		System.out.println("OuterClass static Method");
	}
	
	// Member class of outer class 
	class NestedClass {
		
		public NestedClass() {
			System.out.println("Nested CLass Constructor");
		}
		
		public void testNestedClassMethod() {
			System.out.println(publicOuterVarible);
			System.out.println(privateOuterVarible);
			System.out.println(publicStaticOuterVarible);
			System.out.println(privateStaticOuterVarible);
			outerClassMethod(); // Call Outer class Methods
		}
		
	}
	
	// Static Nested Class 
	static class StaticNestedClass{
		
		public StaticNestedClass() {
			System.out.println("StaticNestedClass Constructor");
		}
		
		public void testStaticNestedClassMethod() {
			// System.out.println(publicOuterVarible);
			// System.out.println(privateOuterVarible);
			System.out.println(publicStaticOuterVarible);
			System.out.println(privateStaticOuterVarible);
			// outerClassMethod(); // Call Outer class Methods
			outerStaticMethod();
		}
	}

}
