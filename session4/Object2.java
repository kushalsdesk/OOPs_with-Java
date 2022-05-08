package com.upgrad.c1.session4;

public class Object2 {
    public static void main(String[] args) {
        // making an instance of the no-args constructor
        Constructors object1 = new Constructors();

        object1.name = "Object1";
        object1.age = 20;
        object1.height = 5.5;

        // making an instance of the parameterized constructor

        Constructors object2 = new Constructors("object2", 30, 10);

        System.out.println("The age of no-args Constructor object is: " + object1.age);
        System.out.println("The age of parameterized Constructor object is: " + object2.age);

    }
}
