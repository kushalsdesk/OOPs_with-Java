// This program only deiopqru8+79monstrate the for loop, but we have other examples with while and do-while loops also
package session3;

import java.util.*;

public class loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the any number");
        int num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.err.println();
        }
        for (int m = num - 1; m >= 1; m--) {
            for (int j = 1; j <= m; j++) {
                System.out.print(m);
            }
            System.out.println();
            ;
        }

        input.close();

    }
}
