package BOJ;

import java.util.Scanner;

public class B10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();

        for(int i = 0; i < N; i++) {
            int num = sc.nextInt();

            if (num < X) {
                System.out.print(num + " ");
            }
        }
    }
}
