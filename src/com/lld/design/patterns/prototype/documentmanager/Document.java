package com.lld.design.patterns.prototype.documentmanager;

public abstract class Document implements  Cloneable{
    public String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Document{" +
                "text='" + text + '\'' +
                '}';
    }
}
