package CLASS1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sqrsum = 0;
        while (st.hasMoreTokens()){
            int num = Integer.parseInt(st.nextToken());
            sqrsum += (num*num);
        }
        System.out.println(sqrsum % 10);
    }
}
