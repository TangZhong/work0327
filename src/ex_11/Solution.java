package ex_11;

/**
 * Return all perfect numbers between [ M, N]
 */
public class Solution {

    public void listPerfects(int start,int end){
            for(int data = start;data<=end;data++){
                ex_4.Solution s = new ex_4.Solution();
                if(s.checkPerfectNumber(data)){
                    System.out.printf("perfect number:%s",data);
                }
            }


    }

}
