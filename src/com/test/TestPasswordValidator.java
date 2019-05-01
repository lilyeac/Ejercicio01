package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestPasswordValidator {
	
	@Test
	public void testValidLength() {
	PasswordValidator pv = new PasswordValidator();
	assertEquals(true, pv.isValid("Abcd123"));
	}
	
	@Test
	public void testValidLength2() {
	assertEquals(true, PasswordValidator.isValid2("Abcd123"));
	}
	
	
	@Test
	public void testValidLength3() {
	assertEquals(true, PasswordValidator.isValid3("Abcd123"));
	}
	
	
	@Test
	public void testValidLength4() {
	assertEquals(true, PasswordValidator.isValid4("Abcd123"));
	}
	
	@Test
	public void testNotDigit() {
	assertEquals(false, PasswordValidator.isValid5("Abcdefg"));
	}
	
	
	@Test
	public void testNotUpperCase() {
	assertEquals(false, PasswordValidator.isValid5("abcdef1"));
	}
	
	@Test
	public void testUpperCaseDigit() {
	assertEquals(true, PasswordValidator.isValid5("AAbcdefee4"));
	}
	
	@Test
	public void testUpperCaseNotDigit() {
	assertEquals(false, PasswordValidator.isValid5("AAbcdefes"));
	}
	
	
	
}
