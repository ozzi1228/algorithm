package CLASS1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2577 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        char[] arr = String.valueOf(A * B * C).toCharArray();

        int[] cnt = new int[10];
        for (char c : arr) {
            cnt[c - '0']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int c : cnt) {
            sb.append(c).append("\n");
        }
        System.out.println(sb);
    }

}
