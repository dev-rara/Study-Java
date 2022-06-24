package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class B2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int numA = Integer.parseInt(st.nextToken());
        int numB = Integer.parseInt(st.nextToken());
        int numC = Integer.parseInt(st.nextToken());

        if(numA == numB && numB == numC && numA == numC) {
            System.out.println(10000 + (numA * 1000));
        } else if (numA == numB || numA == numC) {
            System.out.println(1000 + (numA * 100));
        } else if (numB == numC) {
            System.out.println(1000 + (numB * 100));
        } else {
            System.out.println(Math.max(numA, Math.max(numB, numC)) * 100);
        }
    }
}
