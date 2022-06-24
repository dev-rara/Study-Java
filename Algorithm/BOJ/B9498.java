package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class B9498 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int score = Integer.parseInt(br.readLine());

        if (0 <= score && score <= 100) {
            if (90 <= score) {
                System.out.println("A");
            } else if (80 <= score) {
                System.out.println("B");
            } else if (70 <= score) {
                System.out.println("C");
            } else if (60 <= score) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
        } else {
            System.out.println("0이상 100이하의 숫자를 입력하시오.");
        }
        br.close();
    }
}
