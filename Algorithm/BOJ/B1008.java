package BOJ;

import java.util.Scanner;

public class B1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numA = sc.nextInt();
        int numB = sc.nextInt();

        Double result = (double)numA / numB;
        System.out.println(result);
    }
}
