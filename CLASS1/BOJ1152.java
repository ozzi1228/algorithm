package CLASS1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1152 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] words = br.readLine().trim().split(" ");
        int cnt = 0;
        for (String w : words) {
            if (!w.isBlank()) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }

}
