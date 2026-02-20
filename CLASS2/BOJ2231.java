package CLASS2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2231 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N; i++) {
            int result = decomposition(i);
            if (result == N) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }

    public static int decomposition(int num) {
        int sum = num;
        while (num > 0) {
            sum += (num % 10);
            num /= 10;
        }
        return sum;
    }

}
