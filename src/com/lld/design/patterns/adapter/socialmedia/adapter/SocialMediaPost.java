package com.lld.design.patterns.adapter.socialmedia.adapter;

public class SocialMediaPost {
    private String id;
    private String text;
    private Long userId;
    private Long timestamp;

    public SocialMediaPost(String id, String text, Long userId, Long timestamp) {
        this.id = id;
        this.text = text;
        this.userId = userId;
        this.timestamp = timestamp;
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public Long getUserId() {
        return userId;
    }

    public Long getTimestamp() {
        return timestamp;
    }
}