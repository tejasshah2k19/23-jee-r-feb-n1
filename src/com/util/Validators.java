package com.util;

public class Validators {

	public static boolean isEmpty(String str) {
		return str == null || str.trim().length() == 0;
	}

	// a-zA-Z
	public static boolean isAlpha(String str) {
		return str.trim().matches("[a-zA-Z]+");
	}

	// email
	// password

}
