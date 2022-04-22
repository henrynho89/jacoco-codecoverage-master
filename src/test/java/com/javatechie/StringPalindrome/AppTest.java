package com.javatechie.StringPalindrome;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

	String input1 = "noon";
	App app = new App();
	boolean expected = true;

	@Test
	public void isPlaindromeTest() {
		assertEquals(expected, app.isPalindrome(input1));
	}

	@Test
	public void isNotPlaindromeTest() {
		assertEquals(false, app.isPalindrome("abc"));
	}

	@Test(expected = IllegalArgumentException.class)
	public void isNotPlaindromeExceptionTest() {
		assertEquals(false, app.isPalindrome(null));
	}
	
	int nombrePremier = 7;
	int nombreNonPremier = 8;
	int nombreNegatif=-6;
	boolean isPremier=true;
	boolean isNotPremier=false;
	
	@Test
	public void isPremierTest() {
		assertEquals(true, app.isPremier(7));
	}
	
	@Test
	public void isNotPremierTest() {
		assertEquals(isNotPremier, app.isPremier(nombreNonPremier));
	}
	
	@Test
	public void isNegatifNotPremierTest() {
		assertEquals(isNotPremier, app.isPremier(nombreNegatif));
	}

}