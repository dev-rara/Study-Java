package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class B2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        int time = Integer.parseInt(br.readLine());

        hour = hour + time / 60;
        minute = minute + time % 60;

        if(minute >= 60) {
            hour += 1;
            minute = minute - 60;
        }

        if(hour >= 24) {
            hour = hour - 24;
        }
        System.out.println(hour + " " + minute);
    }
}
