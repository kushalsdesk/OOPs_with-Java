//You will be given an integer n and you need to find the last non-zero digit in n! (factorial n). 
package com.upgrad.c1.session3;

import java.util.*;

public class exercise2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.print(lastNonZeroDigit(n));
        s.close();
    }

    // Method to find the last digit of n!
    static int lastNonZeroDigit(int n) {
        int factorial = 1;

        for (int i = 1; i <= n; ++i) {
            factorial *= i;
        }
        int size = String.valueOf(factorial).length();
        int[] arr = new int[size];
        int i = size;
        do {
            arr[i - 1] = factorial % 10;
            factorial /= 10;
            i--;
        } while (factorial != 0);
        for (i = 0; i < size; i++) {
            if (arr[i] == 0) {
                break;
            }
        }
        return arr[i - 1];
    }

}
