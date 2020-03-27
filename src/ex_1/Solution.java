package ex_1;

/**
 * Input three int values from keyboard, and output them from small to large, here any
 * sort ing algorithms are strictly forbidden, and only the if statement can be employed.
 */
public class Solution {

    public void sort(int a,int b,int c){

        if(a > b){
            if(c > a){// c >a >b
                System.out.printf("%s < %s < %s",b,a,c);
            }else if(c < b){// a >b >c
                System.out.printf("%s < %s < %s",c,b,a);
            }else{// a >c >b
                System.out.printf("%s < %s < %s",b,c,a);
            }
        }else{ // a< b
            if(c < a){ // c< a < b
                System.out.printf("%s < %s < %s",c,a,b);
            }else if(c > b){ //a< b< c
                System.out.printf("%s < %s < %s",a,b,c);
            }else{// a< c< b
                System.out.printf("%s < %s < %s",a,c,b);
            }
        }




    }

}
