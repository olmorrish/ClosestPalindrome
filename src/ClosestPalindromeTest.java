import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClosestPalindromeTest {

	//Tests for isPalindrome(String str)

	@Test
	void singleCharacterPalindromeTest() {
		assertTrue(ClosestPalindrome.isPalindrome("1"));
	}
	
	@Test
	void fiveCharacterPalindromeTest() {
		assertTrue(ClosestPalindrome.isPalindrome("17671"));
	}
	
	@Test
	void twoCharacterNonPalindromeTest() {
		assertFalse(ClosestPalindrome.isPalindrome("12"));
	}

	@Test
	void fiftyCharacterPalindromeTest() {
		assertTrue(ClosestPalindrome.isPalindrome("999999999999999999999999999999999999999999999"));
	}
	
	@Test
	void fiftyCharacterNonPalindromeTest() {
		assertFalse(ClosestPalindrome.isPalindrome("999999999999919999999999999999999999999999999"));
	}
	
	@Test
	void veryLongPalindromeTest() {
		String str = "999999999999999999999999999999999999999999999999999999999999";
		for(int i=0; i<1000; i++) {
			str += "999999999999999999999999999999999999999999999999999999999999";
		}
		assertTrue(ClosestPalindrome.isPalindrome(str));
	}
	
	//Tests for getClosestPalindrome(int inputAsInt)
	
	@Test
	void singleDigitClosestPalindromeTest() {
		assertEquals(ClosestPalindrome.getClosestPalindrome(5), 4);
	}
	
	@Test
	void zeroClosestPalindromeTest() {
		assertEquals(ClosestPalindrome.getClosestPalindrome(0), 1);
	}
	
	@Test
	void inputIsPalindromeTest() {
		assertNotEquals(ClosestPalindrome.getClosestPalindrome(121), 121);
	}
	
	@Test
	void lesserValueForTieTest() {
		assertEquals(ClosestPalindrome.getClosestPalindrome(126), 121);
	}
	
	@Test
	void closestPalindromeToMaxIntegerTest() {
		assertEquals(ClosestPalindrome.getClosestPalindrome(Integer.MAX_VALUE), 2147447412);
	}
	
	@Test
	void closestPalindromeToNegativeNumberTest() {
		assertEquals(ClosestPalindrome.getClosestPalindrome(-127721), 0);
	}
	
	@Test
	void closestPalindromeToMinIntegerTest() {
		assertEquals(ClosestPalindrome.getClosestPalindrome(Integer.MIN_VALUE), 0);
	}
}
