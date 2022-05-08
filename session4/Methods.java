//Java calls it Methods but we can also think this block as functions, but this Methods will actually help with Object Manipulation
package com.upgrad.c1.session4;

public class Methods {
    // signature
    public static void main(String[] args) {
        // body
        // now lets call the method
        int sum = addition(4, 5);// passing the parameters respectively
        System.out.println(sum);
    }

    // Declaration of a method
    static int addition(int a, int b) {
        int ans = a + b;
        return ans;

    }
}
