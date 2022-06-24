package BOJ;

import java.util.Scanner;

public class B10869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numA = sc.nextInt();
        int numB = sc.nextInt();

        if (1 <= numA && numB <= 10000) {
            System.out.println(numA + numB);
            System.out.println(numA - numB);
            System.out.println(numA * numB);
            System.out.println(numA / numB);
            System.out.println(numA % numB);
        } else  {
            System.out.println("1보다 크고 10000보다 작은 수를 입력하시오.");
        }
    }
}
