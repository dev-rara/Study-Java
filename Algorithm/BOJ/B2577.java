package BOJ;

import java.util.Scanner;

public class B2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numA = sc.nextInt();
        int numB = sc.nextInt();
        int numC = sc.nextInt();

        int[] cntArr = new int[10];
        String result = String.valueOf(numA * numB * numC);

        for(int i = 0; i < result.length(); i++) {
            cntArr[result.charAt(i) - '0']++;
        }

        for(int i = 0; i < 10; i++) {
            System.out.println(cntArr[i]);
        }
    }
}
