package CLASS1;

import java.util.Scanner;

public class BOJ11720 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        char[] chars = sc.nextLine().toCharArray();
        int sum = 0;
        for (int i = 0; i < chars.length; i++) {
            sum += Character.getNumericValue(chars[i]);
        }
        System.out.println(sum);
    }

}
