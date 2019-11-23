package com.learn.nested;

public class LocalClass {



	public static void main(String[] args) {
		LocalClass local = new LocalClass();
		local.testLocalClass("30080");

	}
	
	public void testLocalClass(String zipCode) {
		// Class inside methods is called LocalClass
		class Validation{
			
			public Validation() {
				System.out.println("Validation is Local CLass");
			}
			
			public boolean checkZipCode(String zipCode) {
				if(zipCode.length() >= 5) {
					return true;
				}else {
					return false;
				}
			}
		}
		
		Validation valid = new Validation();
		if(valid.checkZipCode(zipCode)) {
			System.out.println("Valid zipCode");
		}
		
	}

}
