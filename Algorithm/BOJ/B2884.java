package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class B2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str," ");

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        if(minute < 45) {
            hour--;
            minute = 60 - (45 - minute);

            if(hour < 0) {
                hour = 23;
            }
            System.out.println(hour + " " + minute);

        } else {
            System.out.println(hour + " " + (minute - 45));
        }
    }
}
