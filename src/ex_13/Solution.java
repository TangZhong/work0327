package ex_13;

/**
 * Return all automorphic numbers less than 1000000.
 */
public class Solution {

        public void listNum(int start,int end){
            System.out.print("automorphic number:");

            for(int data = start;data<=end;data++){
                ex_12.Solution s = new ex_12.Solution();
                if(s.isNum(data)){
                    System.out.printf("%s  ",data);
                }
            }
        }

}
