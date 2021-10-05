import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClosestPalindromeTest {

	@Test
	void oneDigitPalindromeTest() {
		assertTrue(ClosestPalindrome.isPalindrome("1"));
	}
	
	@Test
	void fiveDigitPalindromeTest() {
		assertTrue(ClosestPalindrome.isPalindrome("17671"));
	}
	
	@Test
	void twoDigitNonPalindromeTest() {
		assertFalse(ClosestPalindrome.isPalindrome("12"));
	}

	@Test
	void fiftyDigitPalindromeTest() {
		assertTrue(ClosestPalindrome.isPalindrome("999999999999999999999999999999999999999999999999999999999999"));
	}
	
	@Test
	void fiftyDigitNonPalindromeTest() {
		assertFalse(ClosestPalindrome.isPalindrome("999999999999999999999999999999999991999999999999999999999999999999999999"));
	}
	
	@Test
	void veryLongPalindromeTest() {
		String str = "999999999999999999999999999999999999999999999999999999999999";
		for(int i=0; i<1000; i++) {
			str += "999999999999999999999999999999999999999999999999999999999999";
		}
		assertTrue(ClosestPalindrome.isPalindrome(str));
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
