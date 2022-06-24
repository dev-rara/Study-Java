package BOJ;

import java.util.Scanner;

public class B18108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();

        if (1000 <= y && y <= 3000) {
            System.out.println(y - 543);
        } else {
            System.out.println("1000이상 3000이하의 숫자를 입력하시오.");
        }
    }
}
