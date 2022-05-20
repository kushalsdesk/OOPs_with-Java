// This calculates the lcm of two numbers

package session3;

import java.util.*;

public class exercise3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Enter the two numbers in the input console
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        System.out.print(lcm(number1, number2));
        scan.close();
    }

    public static int lcm(int number1, int number2) {

        int lcm = (number1 > number2) ? number1 : number2;
        while (true) {
            if (lcm % number1 == 0 && lcm % number2 == 0) {
                break;
            }
            ++lcm;
        }
        return lcm;
    }
}