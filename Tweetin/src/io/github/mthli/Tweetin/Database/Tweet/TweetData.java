package io.github.mthli.Tweetin.Database.Tweet;

public class TweetData {
    public static final String TABLE = "TWEET";
    public static final String TWEET_ID = "TWEET_ID";
    public static final String USER_ID = "USER_ID";
    public static final String AVATAR_URL = "AVATAR_URL";
    public static final String CREATED_AT = "CREATED_AT";
    public static final String NAME = "NAME";
    public static final String SCREEN_NAME = "SCREEN_NAME";
    public static final String TEXT = "TEXT";
    public static final String RETWEET = "RETWEET";
    public static final String RETWEETED_BY_NAME = "RETWEETED_BY_NAME";
    public static final String RETWEETED_BY_ID = "RETWEETED_BY_ID";

    public static final String CREATE_SQL = "CREATE TABLE "
            + TABLE
            + " ("
            + " TWEET_ID integer,"
            + " USER_ID integer,"
            + " AVATAR_URL text,"
            + " CREATED_AT text,"
            + " NAME text,"
            + " SCREEN_NAME text,"
            + " TEXT text,"
            + " RETWEET text,"
            + " RETWEETED_BY_NAME text,"
            + " RETWEETED_BY_ID integer"
            + ")";

    private long tweetId;
    private long userId;
    private String avatarUrl;
    private String createdAt;
    private String name;
    private String screenName;
    private String text;
    private String retweet;
    private String retweetedByName;
    private long retweetedById;

    public TweetData() {
        this.tweetId = 0;
        this.userId = 0;
        this.avatarUrl = null;
        this.createdAt = null;
        this.name = null;
        this.screenName = null;
        this.text = null;
        this.retweet = null;
        this.retweetedByName = null;
        this.retweetedById = 0;
    }

    public long getTweetId() {
        return tweetId;
    }
    public void setTweetId(long tweetId) {
        this.tweetId = tweetId;
    }

    public long getUserId() {
        return userId;
    }
    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getScreenName() {
        return screenName;
    }
    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

    public boolean isRetweet() {
        if (retweet.equals("true")) {
            return true;
        } else {
            return false;
        }
    }
    public void setRetweet(boolean retweet) {
        if (retweet) {
            this.retweet = "true";
        } else {
            this.retweet = "false";
        }
    }

    public String getRetweetedByName() {
        return retweetedByName;
    }
    public void setRetweetedByName(String retweetedByName) {
        this.retweetedByName = retweetedByName;
    }

    public long getRetweetedById() {
        return retweetedById;
    }
    public void setRetweetedById(long retweetedById) {
        this.retweetedById = retweetedById;
    }
}