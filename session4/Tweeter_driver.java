package com.upgrad.c1.session4;

import java.util.Scanner;

public class Tweeter_driver {
    public static void main(String[] args) {
        Tweeter_application application = new Tweeter_application();
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! Welcome to the application!");

        int option;
        String flush;

        do {
            System.out.println();

            System.out.println("Please choose your option:");
            System.out.println("1. Create user:");
            System.out.println("2. Accept Follower:");
            System.out.println("3. Post Tweet:");
            System.out.println("4. Get Home Page:");
            System.out.println("5. Follow a User:");
            System.out.println("6. Delete a tweet: ");
            System.out.println("7. Get feed for a user:");
            System.out.println("8. Hide a tweet:");
            System.out.println("Please press anything to quit ");
            option = input.nextInt();
            flush = input.nextLine();
            String name;
            String follower, message;

            switch (option) {
                case 1:
                    System.out.println("Pease enter the username:");
                    name = input.nextLine();
                    application.create_new_user(name);
                    break;
                case 2:
                    System.out.println("What is your Username:");
                    name = input.nextLine();
                    application.Show_follow_requests(name);
                    System.out.println("Who you want to accept as follower:");
                    follower = input.nextLine();
                    application.accept_follow_request(name, follower);

                    break;
                case 3:
                    System.out.println("What is your Username:");
                    name = input.nextLine();
                    System.out.println("Please enter your tweet:");
                    message = input.nextLine();
                    application.post_tweet(name, message);
                    break;
                case 4:
                    System.out.println("What is your Username:");
                    name = input.nextLine();
                    application.show_home_page(name);
                    application.show_followers(name);
                    break;
                case 5:
                    System.out.println("What is your Username:");
                    name = input.nextLine();
                    System.out.println("Name of the user you want to follow:");
                    String following = input.nextLine();
                    application.followed(name, following);
                    break;
                case 6:
                    System.out.println("What is your Username:");
                    name = input.nextLine();
                    application.show_my_tweets(name);
                    System.out.println("Put the id of the tweet you want delete:");
                    int id = input.nextInt();
                    application.delete_tweet(name, id);
                    application.show_my_tweets(name);
                    break;
                case 7:
                    System.out.println("What is your Username:");
                    name = input.nextLine();
                    System.out.println("Name of the user you want to see homepage of:");
                    String feed_user = input.nextLine();
                    application.show_others_feed(name, feed_user);
                    break;
                case 8:
                    break;

                default:
                    System.out.println("Thank you for using. Have a good day");
            }
        } while (option >= 1 && option <= 8);
        input.close();
    }
}
