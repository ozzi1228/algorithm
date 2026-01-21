package CLASS1;

import java.util.Scanner;

public class BOJ2439 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            sb.append(" ".repeat(N-i));
            sb.append("*".repeat(i)).append("\n");
        }
        System.out.println(sb);
    }

}
