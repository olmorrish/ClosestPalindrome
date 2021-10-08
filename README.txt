Oliver Morrish
08/10/2021

-- DESCRIPTION -- 

This program will prompt the user for an integer input, and will then return the closest integer to that input, not including itself. In the event of a tie, the lowest number will be returned.

This algorithm was written with artifial constraints; in-depth research into existing solutions was not permitted (at my own judgement). 

-- ASSUMPTIONS --

The following assumptions were made in this implementation:

1. A negative number cannot be a palindrome, due to the '-' character. As a result, all negative numbers will return the integer 0.
2. An integer is an int primite of size 4 bytes. Input strings which cannot be converted to this primitive (either due to overflow or non-numeral or '-' character input) will cause an exception to be thrown. 

-- EXECUTION --

In the event that the number is negative, 0 is returned and the remainder of the algorithm does not execute.

To check if an integer is a palindrome, it is converted to a string and passed to the isPalindrome() function, which uses two pointers to check the characters on either end of the string, working its way towards the middle. In the event that two mirror characters do not match, it will return false. Otherwise, it will return true. 

The algorithm - seen in getClosestPalindrome() - implements a simple brute-force approach, in which two pointers begin at either side of the given integer. In a loop, these numbers are checked to see if they are palindromes (the lowest first, to ensure it is returned first in the event of a tie). At the end of each loop, the lower pointer is decremented and the higher incremented, though these are gated between 0 and the maximum int value. 

The loop in the algorithm will always terminate. Since the starting number is a positive int, then it suffices to state that 0 is a palindrome, since it will always be reachable in at most MAX INT steps. 

-- EFFICIENCY -- 

The algorithm implemented here is known to be suboptimal, due to its brute-force approach. A more efficient approach should be possible due to the observation that, in higher-magnitude palindromes, the leftmost digits are less likely to change in an input complared to the closest palindrome. Leftmost digits are more likely to be mirrored on the rightmost digits than the inverse, suggesting that this could provide a faster approach. 

A more optimal solution may be explored and implemented in this project shortly. If so, it will be included alongside the current solution and this document will be updated. 

-- TESTS --

JUnit 5 tests are included, which attempt to cover most edge cases for this problem, including: the minimum input value, the maximum input values, and input which causes a tie. 