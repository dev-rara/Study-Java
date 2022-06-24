package BOJ;

import java.util.Scanner;

public class B11021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {
            int numA = sc.nextInt();
            int numB = sc.nextInt();

            System.out.println("Case #" + i + ": " + (numA + numB));
        }
    }
}
