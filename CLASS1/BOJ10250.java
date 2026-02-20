package CLASS1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10250 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            int mod = N % H;
            int floor, room;

            if (mod == 0) {
                floor = H;
                room = N / H;
            } else {
                floor = mod;
                room = N / H + 1;
            }

            if (room < 10) {
                sb.append(floor).append(0).append(room).append("\n");
            } else {
                sb.append(floor).append(room).append("\n");
            }
        }

        System.out.println(sb);
    }

}
