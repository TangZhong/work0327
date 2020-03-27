package ex_19;

/**
 * Check whether an integer is a palindrome number.
 */
public class Solution {

    public boolean isPalindrome(int num){
        ex_16.Solution s = new ex_16.Solution();
        int reverseNum = s.reverse(num);

        return num == reverseNum;
    }

}
