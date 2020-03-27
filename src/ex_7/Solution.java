package ex_7;

/**
 * Return the length of an integer
 */
public class Solution {

    public int length(int temp){
        int digits = 0;

        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        return digits;
    }

}
