package CLASS2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ2798_다른사람풀이_포인터사용 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    StringTokenizer st2 = new StringTokenizer(br.readLine());
    int[] arr = new int[N];
    for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(st2.nextToken());

    Arrays.sort(arr);
    int max = 0;
    for (int i = 0; i < N - 2; i++) {
      int lt = i + 1;
      int rt = N - 1;
      while (lt < rt) {
        int sum = arr[i] + arr[lt] + arr[rt];
        if (sum <= M) {
          max = Math.max(max, sum);
          lt++;
        }else rt--;
      }
    }
    System.out.println(max);


  }

}
