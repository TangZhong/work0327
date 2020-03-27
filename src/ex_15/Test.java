package ex_15;

public class Test {

    public static void main(String[] args) {

        Solution solution = new Solution();
        for(int i = 3;i + 2 < 100;i++){
            boolean isTwinPrimes = solution.isTwinPrimes(i);
            if(isTwinPrimes)
                System.out.println("isTwinPrimes:" + i);
        }

    }

}
