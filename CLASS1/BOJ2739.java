package CLASS1;

import java.util.Scanner;

public class BOJ2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        int N = sc.nextInt();
        for(int i = 1; i <= 9; i++) {
            sb.append(String.format("%d * %d = %d\n", N, i, N * i));
        }
        System.out.println(sb);
    }
}
