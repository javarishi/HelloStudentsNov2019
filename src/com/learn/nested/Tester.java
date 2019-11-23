package com.learn.nested;

public class Tester {



	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		OuterClass.NestedClass nestedInstance = outer.new NestedClass();
		nestedInstance.testNestedClassMethod();
		
		OuterClass.StaticNestedClass staticNestedClass = new OuterClass.StaticNestedClass();
		staticNestedClass.testStaticNestedClassMethod();

	}

}
