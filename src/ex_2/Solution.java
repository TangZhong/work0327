package ex_2;

/**
 * Given an int array, return all even numbers in it.
 */
public class Solution {

    public void even(int [] arr){
        System.out.println("even number:");
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 == 0){
                System.out.printf("%s  ",arr[i]);
            }
        }
    }

}
