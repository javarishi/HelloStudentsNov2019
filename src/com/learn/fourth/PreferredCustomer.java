package com.learn.fourth;

public class PreferredCustomer extends Customer{
	
	public PreferredCustomer() {
		System.out.println("PreferredCustomer Constructor");
	}

	@Override
	public Customer validateAddress(int zipCode) {
		Customer cust = super.validateAddress(zipCode);
		
		if(cust.getZipCode().length() != 5) {
			System.out.println("Customer ZipCode is Incorrect");
		}else {
			System.out.println("Customer has valid ZipCode");
		}
		
		return cust;
	}
	
}
