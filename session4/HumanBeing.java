// we have displayed objects of this class in object.java file
package session4;

public class HumanBeing {
    // this is called static or class-level variale
    static String typeofanimal;
    // Attributes(These are call Object or Instance variable)
    String name;
    double weight;
    int age;

    double height;
    String skincolor;

    // Behaviour
    // Formerly known as instance methods

    public void run() {

    }

    public void speak(String language) {

    }

    public void showName() {
        System.out.println("The name is: " + name);
    }

    public void showType() {
        System.out.println(typeofanimal);
    }

    // static method
    static void changeType(String type) {
        typeofanimal = type;
        // System.out.println(age); here this line will show error, as static methods
        // cannot access by instance variable
    }

}
