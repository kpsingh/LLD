package com.lld.design.patterns.adapter.socialmedia.manager;

import com.lld.design.patterns.adapter.socialmedia.adapter.FacebookAdapter;
import com.lld.design.patterns.adapter.socialmedia.adapter.SocialMediaAdapter;
import com.lld.design.patterns.adapter.socialmedia.adapter.SocialMediaPost;
import com.lld.design.patterns.adapter.socialmedia.adapter.TwitterAdapter;

import java.util.List;

public class SocialMediaManager {
    private SocialMediaAdapter adapterFacebook = new FacebookAdapter();
    private SocialMediaAdapter adapterTwitter = new TwitterAdapter();

    public void getMessages(Long userId, Long timestamp, String platform) {
        if (platform.equals("facebook")) {
            List<SocialMediaPost> posts = adapterFacebook.getPosts(userId, timestamp);

        } else if (platform.equals("twitter")) {
            List<SocialMediaPost> posts = adapterTwitter.getPosts(userId, timestamp);
        }

        // Convert the posts/tweets to a common format
    }
}
