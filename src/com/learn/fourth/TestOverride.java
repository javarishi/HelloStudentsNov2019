package com.learn.fourth;

public class TestOverride {

	public static void main(String[] args) {
		
		
		Customer pCust = new PreferredCustomer();
		Customer cust  = pCust.validateAddress(1);
		
	//	cust.validateSSN("213213902139");
		
		// Assignment - Coding test
		// Even if you pass 1 digit zipcode - make it - 5 digit
		// More than 5 digit -show the message its not a valid zipcode
		// Asignment - Overriding
		// Create - creditCardEligible(String ssnNumber) method in PreferredCustomer class
		// Create a child class - CreditCardCustomer - override creditCardEligible method 
		
	}

}
