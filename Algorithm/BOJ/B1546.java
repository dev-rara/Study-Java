package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.Arrays;

public class B1546 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        double[] score = new double[n];

        for(int i = 0; i < n; i++) {
            score[i] = Double.parseDouble(st.nextToken());
        }

        Arrays.sort(score);
        double sum = 0;

        for(int i = 0; i < n; i++) {
            sum += (score[i] / score[score.length - 1]) * 100;
        }
        System.out.println(sum / n);
    }
}
