package CLASS1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ8958 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            String str = br.readLine();
            int total = 0;
            int cnt = 0;
            char[] chars = str.toCharArray();
            for (char c : chars) {
                if (c == 'O') {
                    cnt++;
                    total += cnt;
                } else if (c == 'X') {
                    cnt = 0;
                }
            }
            sb.append(total).append("\n");

        }
        System.out.println(sb);
    }

}
