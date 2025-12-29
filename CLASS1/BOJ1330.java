package CLASS1;

import java.util.Scanner;

public class BOJ1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int minus = A - B;
        if (minus > 0) System.out.println(">");
        else if (minus == 0) System.out.println("==");
        else System.out.println("<");
    }
}
