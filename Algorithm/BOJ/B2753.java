package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class B2753 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int year = Integer.parseInt(br.readLine());

        if (1 <= year && year <= 4000) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        } else {
            System.out.println("1이상 4000이하의 숫자를 입력하시오.");
        }
    }
}
