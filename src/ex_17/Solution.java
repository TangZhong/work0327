package ex_17;

/**
 * Return the first and the second maximum numbers in an int array, and here you may
 * assume that each element in the array is unique.
 */
public class Solution {

    public void findTop2(int[] nums){

        int [] bubbleArr = bubble(nums);

        System.out.printf("max:%s,secondMax:%s",bubbleArr[bubbleArr.length-1],bubbleArr[bubbleArr.length - 2]);

    }

    public int[] bubble(int[] numbers){


        int i,j;
        for(i=0;i<numbers.length-1;i++)
        {
            for(j=0;j<numbers.length-1-i;j++)
            {
                if(numbers[j]>numbers[j+1])
                {
                    int temp=numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                }
            }
        }

        return numbers;

    }

}
