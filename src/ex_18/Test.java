package ex_18;

public class Test {

    public static void main(String[] args) {

        Solution solution = new Solution();
        double[] reverseaArr = solution.reverse(new double[]{1.1,3.2,4.3});

        for(int i=0;i<reverseaArr.length;i++){
            System.out.println(reverseaArr[i]);
        }

    }

}
