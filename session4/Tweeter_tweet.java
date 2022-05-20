package session4;

public class Tweeter_tweet {

    private int tweet_ID;

    private String message;

    private Tweeter_user owner;

    private boolean isDeleted;

    public Tweeter_tweet(int tweet_ID) {
        this.tweet_ID = tweet_ID;
        this.isDeleted = false;
    }

    public Tweeter_tweet(int id, String msg, Tweeter_user user) {
        this.tweet_ID = id;
        this.message = msg;
        this.owner = user;

    }

    public void set_isDeleted(boolean value) {
        this.isDeleted = value;
    }

    public boolean isDeleted() {
        return this.isDeleted;
    }

    public int gettweet_Id() {
        return this.tweet_ID;
    }

    public String getMessage() {
        return this.message;
    }

}
