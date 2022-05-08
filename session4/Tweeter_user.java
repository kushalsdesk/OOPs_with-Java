package com.upgrad.c1.session4;

public class Tweeter_user {
    // Attributes
    private int user_ID;
    private String user_Name;

    private Tweeter_user[] following;
    private Tweeter_user[] followers;

    private Tweeter_tweet[] myTweets;
    // private Tweeter_tweet[] hiddenTweets;

    private Tweeter_user[] followRequests;

    public Tweeter_user(int uID, String uName) {
        this.user_ID = uID;
        this.user_Name = uName;

        followers = new Tweeter_user[100];
        following = new Tweeter_user[100];
        followRequests = new Tweeter_user[100];

        myTweets = new Tweeter_tweet[500];
        // hiddenTweets = new Tweeter_tweet[500];
    }

    public String getUserName() {
        return this.user_Name;
    }

    public int getUserId() {
        return this.user_ID;
    }

    public Tweeter_user[] get_follwers() {
        return this.followers;
    }

    public Tweeter_user[] get_follow_requests() {
        return this.followRequests;
    }

    public Tweeter_tweet[] getTweets() {
        return this.myTweets;
    }

    public void accept_request(Tweeter_user follower) {
        boolean isValidRequest = false;
        for (int i = 0; i <= 99; i++) {
            if (this.followRequests[i] == null) {
                break;
            }
            if (this.followRequests[i].getUserName() == follower.getUserName()) {
                isValidRequest = true;
                this.followRequests[i] = null;
                break;
            }
        }
        if (!isValidRequest) {
            System.out.println("This is not a valid request");

        } else {
            for (int i = 0; i <= 99; i++) {
                if (this.followers[i] == null) {
                    this.followers[i] = follower;
                    break;
                }
            }
        }
    }

    public void start_following_user(Tweeter_user main) {
        for (int i = 0; i <= 99; i++) {
            if (this.following[i] == null) {
                this.following[i] = main;
                break;
            }
        }
    }

    public boolean isAlreadyfollowing(Tweeter_user Followed) {
        boolean isAlreadyfollowing = false;
        for (int i = 0; i <= 99; i++) {
            if (this.following[i] == null) {
                break;
            } else if (this.following[i] == Followed) {
                isAlreadyfollowing = true;
                break;
            }
        }
        return isAlreadyfollowing;
    }

    public boolean send_request(Tweeter_user following) {
        boolean request_sent = false;

        for (int i = 0; i <= 99; i++) {
            if (this.followRequests[i] == null) {
                this.followRequests[i] = following;
                request_sent = true;
                break;
            }
        }
        return request_sent;
    }

    public boolean add_tweet(Tweeter_tweet tweet) {
        boolean isTweetAdded = false;

        for (int i = 0; i <= 499; i++) {
            if (this.myTweets[i] == null) {
                isTweetAdded = true;
                this.myTweets[i] = tweet;
                break;

            }
        }

        return isTweetAdded;
    }

}
