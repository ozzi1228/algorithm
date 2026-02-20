package CLASS2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2797_recursive {

  static int N, M;
  static int[] arr;
  static boolean[] visited;
  static int max = Integer.MIN_VALUE;

  public static void main(String[] args) throws IOException {
    // 입력
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(br.readLine());
    arr = new int[N];
    visited = new boolean[N];
    for (int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    getSum(0, 0);
    System.out.println(max);
  }

  // 재귀함수
  static void getSum(int cnt, int sum) {

    /// 종료 조건
    // 합이 M 넘어버리면 즉시 리턴
    if (sum > M) {
      return;
    }

    // 세 개 다 채우면 최댓값 갱신해주고 한 개 전으로 돌려보내주고 리턴
    if(cnt == 3) {
      max = Math.max(sum, max);
      return;
    }

    /// 로직
    // 하나를 고른다
    for (int i = 0; i < N; i++) {
      if (!visited[i]) {
        visited[i] = true;
        getSum(cnt + 1, sum + arr[i]);
        visited[i] = false;
      }
    }
  }

}
