package com.codegnan.customException;

public class IncorrectPinLimitReachException extends Exception {
	public IncorrectPinLimitReachException(String errorMsg) {
		super(errorMsg);
	}

}
