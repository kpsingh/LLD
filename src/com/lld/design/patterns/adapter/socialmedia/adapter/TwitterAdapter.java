package com.lld.design.patterns.adapter.socialmedia.adapter;

import com.lld.design.patterns.adapter.socialmedia.external.TwitterApi;
import com.lld.design.patterns.adapter.socialmedia.external.TwitterTweet;

import java.util.List;

public class TwitterAdapter implements SocialMediaAdapter {
    private TwitterApi twitterApi = new TwitterApi();
    @Override
    public List<SocialMediaPost> getPosts(Long userId, Long timestamp) {
        return twitterApi.getTweets(userId).stream().map(TwitterAdapter::to).toList();
    }

    private static SocialMediaPost to(TwitterTweet tweet) {
        return new SocialMediaPost(tweet.getId(), tweet.getTweet(), tweet.getUserId(), null);
    }

    @Override
    public void post(Long userId, String message) {
        twitterApi.tweet(userId, message);
    }
}