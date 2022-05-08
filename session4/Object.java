package com.upgrad.c1.session4;

public class Object {
    public static void main(String[] args) {
        HumanBeing human1 = new HumanBeing(); // this is the declaration and instantiation of an object
                                              // (Class_name object_name = new_keyword Default_Class_contructor_name )
        HumanBeing human2 = new HumanBeing();

        human1.age = 20;
        human2.age = 30;
        human1.name = "Avin";
        human2.name = "Tiala";

        human1.showName();
        human2.showName();

        // Accessing the static variable
        HumanBeing.typeofanimal = "Mammal"; // this static variables can only be accessed by class not by object
        human1.showType();

        // Accessing the static methods

        HumanBeing.changeType("blah!");
        human2.showType();

    }
}
