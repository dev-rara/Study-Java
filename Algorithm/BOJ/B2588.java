package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class B2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numA = Integer.parseInt(br.readLine());
        int numB = Integer.parseInt(br.readLine());

        System.out.println(numA * (numB % 10));
        System.out.println(numA * (numB % 100 / 10));
        System.out.println(numA * (numB / 100));
        System.out.println(numA * numB);

        br.close();
    }
}
