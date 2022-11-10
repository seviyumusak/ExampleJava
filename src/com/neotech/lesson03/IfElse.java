package com.neotech.lesson03;

public class IfElse {

	public static void main(String[] args) {
		
		int bilal = 2;
		if (bilal > 5) {
			System.out.println("He will go to school");
		}
		
		else {
			
			System.out.println("He will not go to school");
			
		}
		
		short a = 55;
		byte b = 66;
		
		a = (short) 66; //narrowing manually
		
		System.out.println(a);
		
		
		b = 55; //widening, automatically
		System.out.println(b);
		
		
		int i = 90;
		double l = 1.99;
		
		i = (int) 1.99;
		System.out.println(i);
		
		l = 90;
		System.out.println(l);
	
		
		int k = 100;
		int e = 200;
		
		System.out.println(k>e);
		
		
		
		
		
		
		
		
		
	}

}
