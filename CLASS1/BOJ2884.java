package CLASS1;

import java.util.Scanner;

public class BOJ2884 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();

        if (M >= 45) {
            System.out.println(H + " " + (M - 45));
            return;
        }

        if (H == 0) {
            H = 24;
        }

        int setTimeMin = H * 60 + M - 45;

        System.out.println(setTimeMin / 60 + " " + setTimeMin % 60);
    }
}
