package ex_5;

/**
 * C heck whether an integer is a 3 digit narcissistic number.
 */
public class Solution {

    public boolean isNarcissistic(int x) {
        int ge = x % 10;
        int shi = x / 10 % 10;
        int bai = x / 10 / 10 % 10;

        return ge * ge * ge + shi * shi * shi + bai * bai * bai == x;

    }

}
