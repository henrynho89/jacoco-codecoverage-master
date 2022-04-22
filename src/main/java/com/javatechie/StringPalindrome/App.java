package com.javatechie.StringPalindrome;

/**
 * Hello world!
 *
 */
public class App {

	public boolean isPalindrome(String input) {

		if (input == null) {
			throw new IllegalArgumentException("input shouldn't be null");
		}

		if (input.equals(reverse(input))) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isDivisible(int nombre,int diviseur) {
		if(nombre%diviseur==0) return true;
		return false;
	}
	
	public boolean isPremier(int nombre) {
		if(nombre<2) return false;
		int sum=0;
		for(int i=1;i<=nombre;i++) {
			if(isDivisible(nombre, i))	sum++;
			if(sum>2) return false;
		}
			
		return true;
	}

	private String reverse(String input) {
		String rev = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			rev = rev + input.charAt(i);
		}
		return rev;
	}
	

}
