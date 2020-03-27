package ex_10;

/**
 * Return all prime numbers between [ M, N]
 */

public class Solution {

    public void listPrimes(int start,int end){

        System.out.print("prime number:");
        for(int data = start;data<=end;data++){
            ex_3.Solution s = new ex_3.Solution();
            if(s.isPrime(data)){
                System.out.printf("%s  ",data);
            }
        }
    }

}
