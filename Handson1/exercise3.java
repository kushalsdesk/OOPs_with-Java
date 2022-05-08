// COnverting Celcius to Fahrenheit
package com.upgrad.c1.Handson1;

import java.util.*;

public class exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celcius = input.nextDouble();
        double fahrenheit = ((celcius * 9) / 5) + 32;

        System.out.println(fahrenheit);
        input.close();
    }
}
