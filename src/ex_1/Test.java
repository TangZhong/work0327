package ex_1;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Solution solution = new Solution();

        Scanner scanner = new Scanner(System.in);

        System.out.println("input num1:");
        int a = scanner.nextInt();

        System.out.println("input num2:");
        int b = scanner.nextInt();

        System.out.println("input num3:");
        int c = scanner.nextInt();

        solution.sort(a,b,c);

    }

}
