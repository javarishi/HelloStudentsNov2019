package com.learn.exceptions;

public class TestWalgreens {

	public static void main(String[] args) {
		Walgreens store121 = new Walgreens();
		try {
			store121.checkCustomerAge(2);
		} catch (ValidationException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}

	}

}
