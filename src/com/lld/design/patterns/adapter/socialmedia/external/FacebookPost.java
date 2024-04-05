package com.lld.design.patterns.adapter.socialmedia.external;

public class FacebookPost {
    private String id;
    private String status;
    private Long userId;
    private Long timestamp;

    public FacebookPost(String id, String status, Long userId, Long timestamp) {
        this.id = id;
        this.status = status;
        this.userId = userId;
        this.timestamp = timestamp;
    }

    public String getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public Long getUserId() {
        return userId;
    }

    public Long getTimestamp() {
        return timestamp;
    }
}
