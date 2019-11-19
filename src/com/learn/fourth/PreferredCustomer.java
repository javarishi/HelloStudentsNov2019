package com.learn.fourth;

public class PreferredCustomer extends Customer{
	
	public final String companyName = "Best Buy Inc";
	
	
	public PreferredCustomer() {
		System.out.println("PreferredCustomer Constructor");
		//this.companyName = "Walmart Inc";
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
