package com.lld.design.patterns.adapter.socialmedia.manager;

import com.lld.design.patterns.adapter.socialmedia.external.FacebookApi;
import com.lld.design.patterns.adapter.socialmedia.external.FacebookPost;
import com.lld.design.patterns.adapter.socialmedia.external.TwitterApi;
import com.lld.design.patterns.adapter.socialmedia.external.TwitterTweet;

import java.util.List;

public class SocialMediaManager {
    private FacebookApi facebookApi = new FacebookApi();
    private TwitterApi twitterApi = new TwitterApi();

    public void getMessages(Long userId, Long timestamp, String platform) {
        if (platform.equals("facebook")) {
            List<FacebookPost> posts = facebookApi.fetchFacebookPosts(userId, timestamp);
        } else if (platform.equals("twitter")) {
            List<TwitterTweet> tweets = twitterApi.getTweets(userId);
        }

        // Convert the posts/tweets to a common format
    }
}
