package ex_9;

import java.util.ArrayList;
import java.util.List;

/**
 * Return each digit of an integ er from left to right
 */
public class Solution {

    public void printDigit(int num){

        List<Integer> list = new ArrayList<>();

        while(num > 0){
            list.add(num % 10);
            num /= 10;
        }

        for(int i=list.size() - 1;i>=0;i--){
            System.out.println(list.get(i));
        }

    }

}
