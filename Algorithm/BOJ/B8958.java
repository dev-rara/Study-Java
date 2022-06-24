package BOJ;

import java.util.Scanner;

public class B8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            char[] cArr = sc.next().toCharArray();
            int sum = 0;
            int cnt = 0;

            for(char c : cArr) {
                if(c == 'O') {
                    cnt++;
                    sum += cnt;
                } else {
                    cnt = 0;
                }
            }
            System.out.println(sum);
        }
    }
}