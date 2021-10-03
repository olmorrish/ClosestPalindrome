import java.util.Scanner;

public class ClosestPalindrome {

    public static void main(String[] args) {
        
        //String intString = args[0];
        
    	System.out.print("Enter number: ");
    	
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
    	
        //what do we do with negatives? '-' counts as a char...
    }

    public static int getClosestPalindrome(int inputAsInt) {

    	if(inputAsInt < 0) {
    		return 0;
    	}
    	else if(isPalindrome(Integer.toString(inputAsInt))) {
    		return inputAsInt;
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
    			
    			if(l > Integer.MIN_VALUE) {
    				l--;
    			}
    			if(r < Integer.MAX_VALUE) {    				
    				r++;
    			}
    		}
    	}
    }
    
    public static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        
        while (i < j) {
            //compare ends
            if(str.charAt(i) != str.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;

    }
}