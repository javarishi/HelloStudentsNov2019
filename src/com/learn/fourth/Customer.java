package com.learn.fourth;

public class Customer 
//	extends Person
{
	
	private String firstName;
	private String address;
	private String zipCode;
	private boolean validAddress = false;
	
	public Customer() {
		System.out.println("Customer Constructor");
	}
	
	/*
	@Override
	public void validateSSN(String ssn) {
		if(ssn.length() == 10) {
			System.out.println("Valid SSN provided");
		}else {
			System.out.println("Not Valid SSN");
		}
	}*/
	
	protected Customer validateAddress(int zipCode) {
		Customer cust = new Customer();
		String zipCodeString = String.valueOf(zipCode);
		int length = zipCodeString.length();
		if(length == 4) {
			zipCodeString = "0"+ zipCode;
		}
		cust.validAddress = true;
		cust.setZipCode(zipCodeString);
		System.out.println("Valid Address :: " + cust.validAddress + " zipCodeString :: " + cust.zipCode);
		return cust;
	}


	/**
	 * @return the zipCode
	 */
	public String getZipCode() {
		return zipCode;
	}


	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	

}
