package session3;

import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int numberOfLines = sc.nextInt();

        for (int i = numberOfLines; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.err.println();
        }
        sc.close();
    }
}
