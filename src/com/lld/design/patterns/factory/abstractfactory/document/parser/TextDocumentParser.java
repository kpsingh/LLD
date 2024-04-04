package com.lld.design.patterns.factory.abstractfactory.document.parser;

import com.lld.design.patterns.factory.abstractfactory.document.DocumentType;

public class TextDocumentParser extends DocumentParser {

    public TextDocumentParser(String path) {
        super(path);
    }

    public void parseDocument() {
        // Parse text document
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.TEXT;
    }
}