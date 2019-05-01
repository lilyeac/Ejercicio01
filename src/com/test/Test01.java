package com.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Test01{
	@Test
	public void test1() {
		 YearUtilities instance = new YearUtilities();
		 assertTrue(instance.isLeap(4));//es bisiesto
	}

	
	@Test
	public void test2() {
		
	assertFalse(YearUtilities.isLeap2(6));	//no es bisiesto
	
	}
	
	@Test
	public void test3() {
		
		assertFalse(YearUtilities.isLeap3(100));//no es bisiesto	
	}
	
	
	@Test
	public void test4() {
	 assertTrue(YearUtilities.isLeap4(400));//es bisiesto
	}

		
	@Test
	public void test5() {
	assertFalse(YearUtilities.isLeap4(2015));//no es bisiesto

	
	}
	@Test
	public void test6() {
	assertTrue(YearUtilities.isLeap4(2016));//es bisiesto
	}
	

}


