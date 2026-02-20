package CLASS1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2920 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String ans;

        if ("1 2 3 4 5 6 7 8".equals(str)) {
            ans = "ascending";
        } else if ("8 7 6 5 4 3 2 1".equals(str)) {
            ans = "descending";
        } else {
            ans = "mixed";
        }

        System.out.println(ans);
    }

}
