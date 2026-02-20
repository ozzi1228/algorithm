package CLASS1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ10809 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        char[] chars = word.toCharArray();

        int[] alphabets = new int[26];
        Arrays.fill(alphabets, -1);

        for (int i = 0; i < chars.length; i++) {
            if (alphabets[chars[i] - 'a'] == -1) {
                alphabets[chars[i] - 'a'] = i;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int cnt : alphabets) {
            sb.append(cnt).append(" ");
        }

        System.out.println(sb.toString().trim());
    }

}
