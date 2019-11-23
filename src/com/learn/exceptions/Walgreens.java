package com.learn.exceptions;

public class Walgreens {

	public static void main(String[] args) {
		Walgreens walgreens = new Walgreens();
		try {
			walgreens.checkCustomerCreditCard("1200123456789121");
		} catch (FinancialValidationException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

	public void checkCustomerAge(int age) throws ValidationException{
		if(age >= 21) {
			System.out.println("Customer can buy alcohol");
		}else {
			// I want to throw an exception
			ValidationException e = new ValidationException("Customer Age is inapproapriate");
			throw e;
		}
	}
	
	
	public void checkCustomerCreditCard(String creditCardDetail) throws FinancialValidationException{
		// If -- 16 digit - Normal Credit Card 
		boolean validity = true;
		String errorMessage = null;
		if(creditCardDetail != null && creditCardDetail.trim().length() > 0) {
			if(creditCardDetail.length() == 16 && (!creditCardDetail.startsWith("1100"))) {
				validity = true;
				System.out.println("Non-Amex Card");
			}else if(creditCardDetail.length() == 15 && creditCardDetail.startsWith("1100")) {
				validity = true;
				System.out.println("American Express Card");
			}else {
				validity = false; 
				
				errorMessage = "Invalid Credit Card Details received";
			}
		}else {
			validity = false; 
			errorMessage = "Credit Card Details are NULL or EMPTY";
		}
		
		if(!validity) {
			throw new FinancialValidationException(errorMessage);
		}
	}
}
