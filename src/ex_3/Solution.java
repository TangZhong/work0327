package ex_3;

/**
 * C heck whether an integer is a prime number.
 */
public class Solution {

    public boolean isPrime(int x){
        boolean isPrime = true;
        if ( x == 1)
        {
            isPrime = false;
        }
        for( int i = 2; i< x; i++)
        {
            if(x % i ==0)
            {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

}
