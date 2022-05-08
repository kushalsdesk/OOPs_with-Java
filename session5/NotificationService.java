//OMG, Perfect example of OOP's facility, There is inheritance , 
//polymorphism , Encapsulation , abstraction and constructor chaining
package com.upgrad.c1.session5;

//Abstracting a class means this is just like prototyping, 
//letting the system know that we will inherit from this later.
//but we dont want to show the functionalities 

abstract public class NotificationService {
    private String message;

    // a setter for the private data
    public void setMessage(String message) {
        this.message = message;
    }

    // a getter for the private data
    public String getMessage() {
        return message;
    }

    // abstracting a method is just like prototyping a method to override later
    abstract String sendNotification();

    // a parameterized constructor to instantiate a object later
    public NotificationService(String message) {
        this.message = message;
    }
}

// defining a class and inheriting from the abstract class
class EmailService extends NotificationService {

    private String email;

    // a parameterized constructor that will help to
    // pass values to this class and the abstract class also
    public EmailService(String message, String email) {
        // constructor call with chaining should done first in the body
        super(message); // this is a constructor chaining call to parent class,
        this.email = email;

    }

    // a setter for private data
    public void setEmail(String email) {
        this.email = email;
    }

    // a getter for the private data
    public String getEmail() {
        return this.email;
    }

    // Overriding the abstract method known as run-time or dynamic polymorphism
    String sendNotification() {
        // here with parent class getter we can access the private data of parent class
        return ("Email sent to" + email + " with message " + super.getMessage());
    }
}

class Source1 {
    public static void main(String[] args) {
        EmailService emailService = new EmailService("Hello", "ishwar@gmail.com");
        System.out.println(emailService.sendNotification());
    }
}