package CLASS1;

import java.util.Scanner;

public class BOJ2741 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        StringBuffer sb = new StringBuffer();
        for(int i = 1 ; i <= N ; i++) {
            sb.append(i + "\n");
        }
        System.out.println(sb);
    }
}
