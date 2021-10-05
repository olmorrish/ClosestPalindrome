import java.util.Scanner;

/**
 * @author Oliver Morrish
 * Prompts the user for an integer and prints the closest palindrome.
 *  In the case of a tie, the lowest palindrome will be printed.
 *  User input must be convertable to an int (4 bytes) or an exception will be thrown.
 *  The negative sign is considered in palindromes and so negatives always return 0 (ex: input of -121 returns 0)
 */
public class ClosestPalindrome {

    public static void main(String[] args) {
    	System.out.print("Enter a number: ");
    	
    	Scanner keyboard = new Scanner(System.in);
    	String input = keyboard.next();
    	
    	try {    		
    		int inputAsInt = Integer.parseInt(input);
    		int closestPalindrome = getClosestPalindrome(inputAsInt);
        	System.out.println("The closest palindrome to " + input + " is " + closestPalindrome);
    	}
    	catch(NumberFormatException e) {
    		System.err.println("Error parsing int. The input may not have been a number, or may have been too large. " + e);
    	}
    	
    	keyboard.close();
    }

    /**
     * Gets the closest integer palindrome to a given int.
     * @param inputAsInt The user input as an integer
     * @return The closest Integer which is a palindrome, or the lesser of two in the event of a tie.
     */
    public static int getClosestPalindrome(int inputAsInt) {
    	if(inputAsInt < 0) {
    		return 0;
    	}

    	else {    		
    		int l = inputAsInt - 1;
    		int r = inputAsInt + 1;
    		
    		while(true) {
    			if(isPalindrome(Integer.toString(l))) {
    				return l;
    			}
    			else if(isPalindrome(Integer.toString(r))) {
    				return r;
    			}
    			
    			if(l > 0) { //assuming negative => not palindrome 
    				l--;
    			}
    			if(r < Integer.MAX_VALUE) {    				
    				r++;
    			}
    		}
    	}
    }
    
    /**
     * Checks if a string is a palindrome.
     * @param str the string to check whether it's a palindrome
     * @return true if str is a palindrome, false otherwise
     */
    public static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        
        while (i < j) {
            if(str.charAt(i) != str.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}