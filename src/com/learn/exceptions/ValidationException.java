package com.learn.exceptions;

public class ValidationException extends Exception {

	public ValidationException() {
		System.out.println("Custom Exception : ValidationException");
	}

	public ValidationException(String message) {
		super(message);
		System.out.println("Custom Exception : ValidationException");
	}

	public ValidationException(Throwable cause) {
		super(cause);
		System.out.println("Custom Exception : ValidationException");
	}

	public ValidationException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ValidationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
