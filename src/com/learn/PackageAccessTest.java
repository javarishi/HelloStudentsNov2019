package com.learn;

public class PackageAccessTest {

	public static void main(String[] args) {
		AccessModifers object= new AccessModifers();
		System.out.println(object.publicVariable);
		System.out.println(object.protectedVariable);
		System.out.println(object.defaultVariable);
		//System.out.println(object.privateVariable);
	}

}
