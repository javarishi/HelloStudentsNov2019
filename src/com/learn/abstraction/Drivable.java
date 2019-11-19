package com.learn.abstraction;

import java.io.Serializable;

public interface Drivable extends Serializable {
	
	// Variables in interfaces are always public static final
	String vehicleName = "Car";
	
	// Default - all methods in interfaces are public abstract
	public void engineMechanics();
	
	// Some exceptional methods
	public default void mustHaveImplementation() {
		System.out.println("Sorry I cant stop myself ");
	}

}
