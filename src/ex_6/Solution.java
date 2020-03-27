package ex_6;

/**
 * C heck whether an integer is a length digit narcissistic number , here length digit
 * represents the length of the integer
 */
public class Solution {

    public boolean isNarcissisticNumber(int value) {
                 int temp = value;
                 int digits = 0;

                 while (temp > 0) {
                         digits++;
                         temp /= 10;
                     }
                 temp = value;
                int sum = 0;
                while (temp > 0) {
                        sum += Math.pow(temp % 10, digits);
                        temp /= 10;
                     }
                 return sum == value;
    }

}
