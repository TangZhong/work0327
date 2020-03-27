package ex_18;

/**
 * Reverse and return a double array.
 */
public class Solution {

    public double[] reverse(double[] originArray) {

        double temp;
        for(int i=0;i<originArray.length/2;i++){
            temp = originArray[i];
            originArray[i] = originArray[originArray.length - i - 1];
            originArray[originArray.length - i - 1] = temp;

        }

        return originArray;

    }


}
