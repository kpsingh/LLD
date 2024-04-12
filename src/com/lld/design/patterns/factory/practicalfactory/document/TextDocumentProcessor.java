package com.lld.design.patterns.factory.practicalfactory.document;


public class TextDocumentProcessor extends DocumentProcessor {
    public TextDocumentProcessor(String documentName) {
        super(documentName);
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.TEXT;
    }

    @Override
    public void processDocument() {
        // Implement text document processing logic
        System.out.println("Processing a text document: " + getDocumentName());
        // Additional logic for text document processing
    }
}
