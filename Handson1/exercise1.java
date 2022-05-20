package Handson1;

import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        boolean isPrime = true;

        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(number + " is Prime");
        } else {
            System.out.println(number + " is Non-prime");
        }
        input.close();
    }

}