package ex_8;

/**
 * Return each digit of an integer from right to left
 */
public class Solution {

    public void printDigit(int num){

        while(num > 0){
            System.out.println(num % 10);
            num /= 10;
        }

    }

}
