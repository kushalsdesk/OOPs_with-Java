package session2;

//import java.util.*;

public class Variables {
    public static void main(String[] args) {
        // data_type name_of_variable value
        /*
         * byte byte_variable = 123;
         * short short_variable = 23456;
         * int int_variable = 12345678;
         * long long_variable = 12345678909l;
         * float float_variable = 4.6f;
         * double double_variable = 4.65666;
         * boolean flag = false;
         * char char_variable = 'A';
         * 
         * // non-primitive datatypes
         * String hello = "I am Java";
         * System.out.println(hello);
         * 
         * // declaration
         * int num;
         * 
         * // initialization
         * num = 5;
         * 
         * System.out.println(int_variable);
         * 
         * // type_casting
         * 
         * // int to double(widening_casting)
         * double num2 = num;
         * System.out.println(num2);
         * 
         * // double to int(narrowing_casting)
         * 
         * int double_variable2 = (int) double_variable;
         * System.out.println(double_variable2);
         * 
         * // difference between println & printf
         * 
         * System.out.println("Hello " + hello + ".Next codes....");
         * System.out.printf("Hello %s .Next codes....", hello);
         * 
         * System.out.println("Give your Marks: ");
         * Scanner input = new Scanner(System.in);
         * double marks = input.nextDouble();
         * 
         * System.out.println("Marks is :" + marks);
         */

        // Scanner input = new Scanner(System.in);
        /*
         * * System.out.println("Enter the first Number:");
         * int first_num = input.nextInt();
         * 
         * System.out.println("Enter the second Number: ");
         * int second_num = input.nextInt();
         * 
         * int summation = first_num + second_num;
         * double division = (double) first_num / (double) second_num;
         * 
         * System.out.println("The summation is " + summation);
         * System.out.println("The division is " + division);
         */
        // To check if someone has passed or not with logical operator and boolean

        // System.out.println("Enter your marks: ");
        // double marks = input.nextDouble();

        // boolean haspassed = marks > 39;
        // System.out.println(haspassed);

        // System.out.println("Enter the value");
        // boolean issafe = input.nextBoolean();

        // System.out.println(issafe);

        // Declaring an Array,

        int arr[] = new int[2];

        // Initializing the values
        arr[0] = 4;
        arr[1] = 5;

        System.out.println(arr[0]);

        // Dclaring and initializing at same time
        int[] arr1 = { 2, 3, 4, 5, 6 };
        // or int arr1[] = new int [] {2,3,4,5,6};

        System.out.println(arr1[0]);
    }
}
