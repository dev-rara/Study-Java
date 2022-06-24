package BOJ;

import java.util.Scanner;

public class B2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int maxVal = 0;
        int maxIdx = - 1;

        for(int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] > maxVal) {
                maxVal = arr[i];
                maxIdx = i + 1;
            }
        }
        System.out.println(maxVal);
        System.out.println(maxIdx);
    }
}
