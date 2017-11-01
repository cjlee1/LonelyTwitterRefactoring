package ca.ualberta.cs.lonelyTweets;

import java.util.Date;

public class NormalLonelyTweet extends LonelyTweet {

	public NormalLonelyTweet() {
	}

	public NormalLonelyTweet(String text, Date date) {
		this.tweetDate = date;
		this.tweetBody = text;
	}

	@Override
	public boolean isValid() {
		//simplified the if statement and took it out
		return !(tweetBody.trim().length() == 0
				|| tweetBody.trim().length() > 20);

	}

	@Override
	public String getTweetBody() {
        return tweetBody.toUpperCase();
    }
}