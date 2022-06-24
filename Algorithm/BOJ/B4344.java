package BOJ;

import java.util.Scanner;

public class B4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int caseCnt = sc.nextInt();
        int[] arr;

        for(int i = 0; i < caseCnt; i++) {
            int n = sc.nextInt();
            arr = new int[n];

            double sum = 0;

            for(int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
                sum += arr[j];
            }

            double avg = sum / n;
            double studentCnt = 0;

            for(int j = 0; j < n; j++) {
                if(arr[j] > avg) {
                    studentCnt++;
                }
            }
            System.out.printf("%.3f%%\n", (studentCnt / n) * 100);
        }
    }
}
