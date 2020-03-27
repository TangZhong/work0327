package ex_12;

/**
 * Check whether an integer is an automorphic number
 */
public class Solution {

    public boolean isNum(int i) {
        int s = i * i;

        while (i != 0) {
            int tmp1 = i % 10;
            i /= 10;
            int tmp2 = s % 10;
            s /= 10;
            if (tmp1 != tmp2) {
                return false;
            }
        }
        return true;
    }

}
