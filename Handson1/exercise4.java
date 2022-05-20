//Making a Fibonacci series with while loop
package Handson1;

import java.util.*;

public class exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENter how many numbers want to print:");
        int limit = input.nextInt();

        int next = 0, last = 1, count = 0;
        System.out.print(next + " ");
        while (count < limit - 1) {
            System.out.print(last + " ");
            int sum = next + last;
            next = last;
            last = sum;
            count++;
        }
        input.close();
    }
}
