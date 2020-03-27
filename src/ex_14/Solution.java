package ex_14;

/**
 * Sort and return a double array by the bubble sort algorithm.
 */
public class Solution {

    public double[] bubble(double[] numbers){


        int i,j;
        for(i=0;i<numbers.length-1;i++)
        {
            for(j=0;j<numbers.length-1-i;j++)
            {
                if(numbers[j]>numbers[j+1])
                {
                    double temp=numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                }
            }
        }

        return numbers;

    }

}
