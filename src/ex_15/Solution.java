package ex_15;


/**
 * Output all pairs of twin-primes less than 1000.
 */
public class Solution {

    public boolean isTwinPrimes(int data){
        ex_3.Solution solution = new ex_3.Solution();
        return solution.isPrime(data) && solution.isPrime(data + 2);
    }

}
