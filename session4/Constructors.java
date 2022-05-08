package com.upgrad.c1.session4;

public class Constructors {
    // lets have a constructor

    // no-args constructor
    /*
     * Constructors cannot have non-access modifiers, return type and the name
     * should be exaclty as Class_name
     */

    String name;
    int age;
    double height;

    public Constructors() {
        System.out.println("Hi , I am a no-args Constructor");

    }

    // parameterized constructor

    public Constructors(String n, int a, double h) {
        System.out.println("Hi , I am a parameterized Constructor");
        name = n;
        age = a;
        height = h;

    }
}
