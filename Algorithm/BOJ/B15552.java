package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class B15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for(int i = 1; i <= T; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            int numA = Integer.parseInt(st.nextToken());
            int numB = Integer.parseInt(st.nextToken());
            bw.write(numA + numB + "\n");
        }
        bw.flush();
    }
}

