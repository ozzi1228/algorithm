package CLASS1;

import java.util.Scanner;

public class BOJ31403 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); sc.nextLine();
        int B = sc.nextInt(); sc.nextLine();
        int C = sc.nextInt(); sc.nextLine();

        StringBuilder sb = new StringBuilder();
        sb.append(A + B - C).append("\n");
        sb.append(Integer.parseInt(Integer.toString(A) + B) - C);

        System.out.println(sb);
    }

}
