package com.lld.design.patterns.factory.abstractfactory.document.parser;


import com.lld.design.patterns.factory.abstractfactory.document.DocumentType;

public abstract class DocumentParser {

    private final String path;

    public DocumentParser(String path) {
        this.path = path;
    }

    public abstract void parseDocument();

    public String getPath() {
        return path;
    }

    public abstract DocumentType supportsType();

}
