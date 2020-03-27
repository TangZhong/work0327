package ex_6;

public class Test {

    //0, 1, 2, 3, 4, 5, 6, 7, 8,
    // 9, 153, 370, 371, 407, 1634, 8208, 9474
    public static void main(String[] args) {

        Solution solution = new Solution();
        boolean isNarcissisticNumber = solution.isNarcissisticNumber(9474);

        System.out.printf("isNarcissisticNumber:%s",isNarcissisticNumber);
    }

}
