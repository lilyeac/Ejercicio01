package com.test;

public class YearUtilities {
	
	
		public boolean isLeap(int year){
		return true;
		}
		
		public static boolean isLeap1(int year) {
			return true;
		}
		public static boolean isLeap2(int year) {
			if(year%4==0) {
				return true;
				
			}else {
				return false;
			}
		}
	
		
		
		public static boolean isLeap3(int year){
			if(year%4 == 0){
			if(year%100 ==0){
			return false;
			}else{
			return true;
			}
			}else{
			return false;
			}
			}
		
		
		
		
		public static boolean isLeap4(int year){
			if(year%4 == 0){
			if(year%100 ==0){
			if(year%400 ==0){
			return true;
			}else{
				return false;
			}
			}else{
			return true;
			}
			}else{
			return false;
			}
			}
			
		
		
	}


