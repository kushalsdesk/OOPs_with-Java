package session3;

import java.util.*;

public class Conditionals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Num = input.nextInt();
        boolean isNumEven = Num % 2 == 0;

        if (isNumEven) {
            System.out.println("The number is even");

        } else {
            System.out.println("The number is odd");
        }
        input.close();
    }
}
