package CLASS2;

import java.util.Scanner;

public class BOJ2292 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int max = 1;
        int range = 1;

        while (max < N) {
            range++;
            max = max + 6 * (range - 2);
        }

        if (range == 1) {
            System.out.println(range);
        } else if (range > 1) {
            System.out.println(range - 1);
        }
    }

}
