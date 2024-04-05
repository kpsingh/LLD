package com.lld.design.patterns.factory.abstractfactory.document.processor;

import com.lld.design.patterns.factory.abstractfactory.document.DocumentType;

public class TextDocumentProcessor extends DocumentProcessor {

    public TextDocumentProcessor(String documentName) {
        super(documentName);
    }

    @Override
    public void processDocument() {
        // Implement text document processing logic
        System.out.println("Processing a text document: " + getDocumentName());
        // Additional logic for text document processing
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.TEXT;
    }
}