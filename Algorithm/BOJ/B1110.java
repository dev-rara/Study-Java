package BOJ;

import java.util.Scanner;

public class B1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int tmp = N;
        int cnt = 0;

        while (true) {
            N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
            cnt++;

            if (tmp == N) {
                break;
            }
        }
        System.out.println(cnt);
    }
}
