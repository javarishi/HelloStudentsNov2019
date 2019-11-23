package com.learn.exceptions;

public class TestException {

	public static void main(String[] args) {
		
		System.out.println("Before Risky Code");
		/*
		 * try {
		 * 	risky code
		 * }catch(ArrayIndexOutOfBoundsException ex){
		 * 		say what to do if this exception occurs
		 * }
		 */
		try {
			int[] simpleArray = {1,2,3};
			System.out.println(simpleArray[5]);
		}catch(Exception ex) {
			System.out.println("Exception in Main method");
		}
		System.out.println("After Risky Code");
		
		TestException test  =  new TestException();
		test.checkZipCode("AAAA");
	}
	

	
	
	
	
	public void checkZipCode(String zipCode) {
		try {
			int zipCodeInt = Integer.parseInt(zipCode.trim());
			System.out.println(zipCodeInt);
		}catch(NumberFormatException nex) {
			System.out.println("Wrong Zip Code provided");
		}catch (NullPointerException nullEx) {
			System.out.println("You passed Null ZipCode");
		}catch(RuntimeException rex) {
			System.out.println("Something else is wrong");
		}finally {
			System.out.println("Please try next zip Code");
		}
	}

}
