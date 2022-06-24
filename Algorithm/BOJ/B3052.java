package BOJ;

import java.util.Scanner;
import java.util.HashSet;

public class B3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        int[] arr = new int[10];

        for(int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            set.add(arr[i] % 42);
        }
        System.out.println(set.size());
    }
}
