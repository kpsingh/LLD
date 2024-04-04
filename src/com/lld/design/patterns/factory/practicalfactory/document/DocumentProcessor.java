package com.design.patterns.factory.practicalfactory.document;

public abstract class DocumentProcessor {

    public String documentName;

    public DocumentProcessor(String documentName) {
        this.documentName = documentName;
    }

    public abstract DocumentType supportsType();

    public abstract void processDocument();

    public String getDocumentName() {
        return documentName;
    }
}
