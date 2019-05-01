package com.test;

import java.util.regex.Pattern;

public class PasswordValidator {
	
	
	public boolean isValid(String password) {
		if (password.length() >= 7 && password.length() <= 10) {
		return true;
		}
		else {
		return false;
		}
		}
	
	
	public static boolean isValid2(String password) {
		if (password.length() >= 7 && password.length() <= 10) {
		return true;
		}
		else {
		return false;
		}
		}
	
	public static boolean isValid3(String password) {
		return (password.length() >= 7 &&
		password.length() <= 10);
		}
	

	
	private final static int MIN_PW_LENGTH = 7;
	private final static int MAX_PW_LENGTH = 10;
	public static boolean isValid4(String password) {
	return (password.length() >= MIN_PW_LENGTH && password.length() 
			<= MAX_PW_LENGTH);
	}
	
	
	

	public static boolean isValid5(String password) {
	return (password.length() >= MIN_PW_LENGTH && password.length() 
			<= MAX_PW_LENGTH)&& Pattern.matches(".*\\p{Digit}.*", password);
	}
	

}
