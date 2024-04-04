package com.lld.design.patterns.prototype.documentmanager;

public class Report extends Document {
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Report{" +
                "author='" + author + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
