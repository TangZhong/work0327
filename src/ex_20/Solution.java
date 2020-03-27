package ex_20;

/**
 * Output all pairs of amicable numbers less than 10000.
 */
public class Solution {

    public void listAmicable() {
        int sA = 0;
        int sB = 0;
        for(int i=1;i<100001;i++){
            sA = getSum(i);
            sB = getSum(sA);

            if(sA>i){

                if(sB==i){
                    System.out.println(i+" and "+sA+" is amicable numbers");
                }
            }
        }
    }
    public static int getSum(int num){
        int sum = 0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum = sum+i;
            }
        }
        return sum;
    }

}
