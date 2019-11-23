package com.learn.nested;

public class AnonymousInnerClass {

	public static void main(String[] args) {
		Reachable customer = new Reachable() {
			
			@Override
			public void validateAddress(String address) {
				if(address != null) {
					System.out.println("Address is valid");
				}
				
			}
		};
		
		customer.validateAddress("Spring Hill Prkwy");

	}

}
