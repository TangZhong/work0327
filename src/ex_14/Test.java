package ex_14;

public class Test {

    public static void main(String[] args) {

        Solution solution = new Solution();
        double[] bubbleArr = solution.bubble(new double[]{2.1,1.3,5.4});

        for(int i=0;i<bubbleArr.length;i++){
            System.out.println(bubbleArr[i]);
        }

    }

}
