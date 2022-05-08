// The pattern making program, pascal's triangle with numbers(but with a mixed triangle)

package com.upgrad.c1.Handson1;

import java.util.*;

public class exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for (int i = 1; i <= num + 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.err.println();
        }
        for (int m = num; m >= 1; m--) {
            for (int j = 1; j <= m; j++) {
                System.out.print(m);
            }
            System.out.println();
            ;
        }

        input.close();

    }
}
