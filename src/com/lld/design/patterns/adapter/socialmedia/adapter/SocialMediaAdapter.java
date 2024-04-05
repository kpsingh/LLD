package com.lld.design.patterns.adapter.socialmedia.adapter;

import java.util.List;

public interface SocialMediaAdapter {

    List<SocialMediaPost> getPosts(Long userId, Long timestamp);

    void post(Long userId, String message);
}