package CLASS2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ30802 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        double[] size = new double[6];
        for (int i = 0; i < 6; i++) {
            size[i] = Double.parseDouble(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        double T = Double.parseDouble(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int tBundleCnt = 0;
        for (double s : size) {
            tBundleCnt += (int) Math.ceil(s / T);
        }
        System.out.println(tBundleCnt);
        System.out.println((N / P) + " " + (N % P));
    }

}
