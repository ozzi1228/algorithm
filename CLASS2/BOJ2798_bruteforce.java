package CLASS2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ2798_bruteforce {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(br.readLine());
    int[] arr = new int[N];
    for (int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    // ---
    Arrays.sort(arr);
    int max = Integer.MIN_VALUE;

    for (int i = 0; i < N - 2; i++) {
      for (int j = i + 1; j < N - 1; j++) {
        for (int k = j + 1; k < N; k++) {
//          System.out.println("arr[i]: " + arr[i] + " arr[j]: " + arr[j] + " arr[k]: " + arr[k]);
          int sum = arr[i] + arr[j] + arr[k];
          if (sum <= M && sum > max) {
            max = sum;
          }
        }
      }
    }

    System.out.println(max);
  }

}
