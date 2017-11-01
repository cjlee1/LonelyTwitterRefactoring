package ca.ualberta.cs.lonelyTweets;

import java.util.Date;

public class ImportantLonelyTweet extends LonelyTweet {

	public ImportantLonelyTweet() {
	}

	public ImportantLonelyTweet(String text, Date date) {
		this.tweetDate = date;
		this.tweetBody = text;
	}

	@Override
	public boolean isValid() {
//        took out the if statement and made it more simplified
        return !(tweetBody.trim().length() == 0
                || tweetBody.trim().length() > 10);

    }

	@Override
	public String getTweetBody() {
        return tweetBody.toUpperCase();
    }
}