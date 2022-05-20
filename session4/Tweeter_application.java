package session4;

public class Tweeter_application {

    // Attributes
    private Tweeter_user[] allUsers;
    private Tweeter_tweet[] allTweets;

    private int maxTweeterId;
    private int maxUserId;

    public Tweeter_application() {
        this.allTweets = new Tweeter_tweet[1000];
        this.allUsers = new Tweeter_user[500];

        this.maxTweeterId = -1;
        this.maxUserId = -1;
    }

    // Creating a user
    public void create_new_user(String user_name) {
        if (maxUserId == 499) {
            System.out.println("Sorry!, we cannot have more users right now.....");
        } else if (user_name.equals("")) {
            System.out.println("User name cannot be empty");
        } else if (getUserObjIfvalid(user_name) != null) {
            System.out.println("This username already exists");
        } else {
            maxUserId++;
            Tweeter_user user = new Tweeter_user(maxUserId, user_name);
            allUsers[maxUserId] = user;
            System.out.println("User got created successfully");
        }

    }

    public void Show_follow_requests(String user) {
        Tweeter_user main = getUserObjIfvalid(user);
        Tweeter_user[] requests = main.get_follow_requests();
        for (Tweeter_user ele : requests) {
            if (ele == null) {
                break;
            } else {
                System.out.println("The follower Id: ( " + ele.getUserId() + " ) & with name: ( " + ele.getUserName()
                        + " )  wants to follow you");
            }
        }
    }

    public void accept_follow_request(String mainUser, String follower) {
        Tweeter_user main = getUserObjIfvalid(mainUser);
        Tweeter_user follow = getUserObjIfvalid(follower);

        if (main == null || follow == null) {
            System.out.println("Invalid Username entered!");

        } else {
            main.accept_request(follow);
            follow.start_following_user(main);

            System.out.println("The user is now accepted as a follower");

        }
    }

    // Creating a tweet
    public void post_tweet(String name, String message) {
        if (maxTweeterId == 999) {
            System.out.println("We can't accpet tweet right now");
        } else if (message.equals("")) {
            System.out.println("Tweet cannot be empty");
        } else if (getUserObjIfvalid(name) == null) {
            System.out.println("User does not exist");
        } else {
            maxTweeterId++;
            Tweeter_user user = getUserObjIfvalid(name);
            Tweeter_tweet tweet = new Tweeter_tweet(maxTweeterId, message, user);
            boolean isTweetAdded = user.add_tweet(tweet);
            if (isTweetAdded) {
                allTweets[maxTweeterId] = tweet;
                System.out.println("Tweet got posted successfully");

            } else {
                System.out.println("Sorry we can't accept tweets right now");
                maxTweeterId--;
            }
        }
    }

    public void show_home_page(String name) {
        Tweeter_user user = getUserObjIfvalid(name);
        if (user == null) {
            System.out.println("User does not exist");
        } else {
            Boolean isEmptyHomepage = true;
            Tweeter_tweet[] userTweets = user.getTweets();
            for (Tweeter_tweet ele : userTweets) {
                if (ele == null) {
                    break;
                } else if (!ele.isDeleted()) {
                    isEmptyHomepage = false;
                    System.out.println("Tweet id: " + ele.gettweet_Id() + " ,Tweet: ( "
                            + ele.getMessage() + " )");
                }
            }
            if (isEmptyHomepage) {
                System.out.println("Your homepage seems to be empty");
            }
        }
    }

    public void show_followers(String name) {
        Tweeter_user user = getUserObjIfvalid(name);
        Tweeter_user[] follower_array = user.get_follwers();
        for (Tweeter_user ele : follower_array) {
            if (ele == null) {
                break;
            } else {
                System.out.println(
                        "The follower is with id : ( " + ele.getUserId() + "  ) with name " + ele.getUserName());
            }
        }
    }

    public void followed(String follower, String following) {
        Tweeter_user Follower = getUserObjIfvalid(follower);
        Tweeter_user Following = getUserObjIfvalid(following);
        if (Follower == null || Following == null) {
            System.out.println("Maybe one of the user or both doesn't exist");
        } else if (Follower.isAlreadyfollowing(Following)) {
            System.out.println("You are already following the user..");
        } else {
            boolean request = Following.send_request(Follower);
            if (!request) {
                System.out.println("Request cannot be sent");
            } else {
                System.out.println("request sent successfully");
            }
        }
    }

    public void show_my_tweets(String name) {
        Tweeter_user user = getUserObjIfvalid(name);
        if (user == null) {
            System.out.println("The user don't exists");

        } else {
            Tweeter_tweet[] user_tweets = user.getTweets();
            for (Tweeter_tweet ele : user_tweets) {
                if (ele == null) {
                    break;
                } else if (ele.isDeleted()) {
                    continue;
                } else {
                    System.out.println("Tweet id: " + ele.gettweet_Id() + " ,Tweet: ( "
                            + ele.getMessage() + " )");
                }
            }
        }
    }

    public void delete_tweet(String name, int id) {
        Tweeter_tweet tweet = getTweeterObjIfValid(id);
        Tweeter_user user = getUserObjIfvalid(name);
        boolean deleted = false;
        if (tweet == null) {
            System.out.println("The tweet doesn't exist....");
        } else if (user == null) {
            System.out.println("The user don't exists");
        } else {
            Tweeter_tweet[] user_tweets = user.getTweets();
            for (Tweeter_tweet ele : user_tweets) {
                if (ele == null) {
                    break;
                } else if (ele.isDeleted()) {
                    System.out.println("The tweet is already got deleted");
                    System.out.println();
                    break;
                } else if (ele.gettweet_Id() == tweet.gettweet_Id()) {
                    ele.set_isDeleted(true);
                    deleted = true;
                    break;
                }
            }
        }
        if (deleted) {
            System.out.println("The tweet got deleted");
            System.out.println();
        }
    }

    public void show_others_feed(String name, String feed_user) {
        Tweeter_user user = getUserObjIfvalid(name);
        Tweeter_user user2 = getUserObjIfvalid(feed_user);
        if (user == null || user2 == null) {
            System.out.println("Maybe one of the user or both doesn't exist");
        } else if (user.getUserId() == user2.getUserId()) {
            System.out.println("You have requested to see your own homepage, LOL");
        } else {
            System.out.println("The homepage of " + user2.getUserName());
            Boolean isEmptyHomepage = true;
            Tweeter_tweet[] user_tweets = user2.getTweets();
            for (Tweeter_tweet ele : user_tweets) {
                if (ele == null) {
                    break;
                } else if (ele.isDeleted()) {
                    continue;
                } else {
                    isEmptyHomepage = true;
                    System.out.println("Tweets of " + user2.getUserName() + " id: " + ele.gettweet_Id() + " ,Tweet: ( "
                            + ele.getMessage() + " )");
                }
            }
            Tweeter_user[] follower_array = user2.get_follwers();
            for (Tweeter_user ele : follower_array) {
                if (ele == null) {
                    break;
                } else {
                    isEmptyHomepage = true;
                    System.out.println(
                            "The followers of  " + user2.getUserName() + "  is with id : ( " + ele.getUserId()
                                    + "  ) with name " + ele.getUserName());
                }
            }
            if (isEmptyHomepage) {
                System.out.println(user2.getUserName() + "'s homepage seems to be empty");
            }
        }
    }

    public Tweeter_user getUserObjIfvalid(String userName) {
        for (Tweeter_user ele : allUsers) {
            if (ele == null) {
                break;
            } else if (ele.getUserName().equals(userName)) { // equals() is just a method to
                // check if two strings are equal
                // or not
                return ele;
            }
        }
        return null;
    }

    public Tweeter_tweet getTweeterObjIfValid(int tweet_Id) {
        for (Tweeter_tweet ele : allTweets) {
            if (ele == null) {
                break;
            } else if (ele.gettweet_Id() == tweet_Id) {
                return ele;
            }
        }
        return null;
    }

}
