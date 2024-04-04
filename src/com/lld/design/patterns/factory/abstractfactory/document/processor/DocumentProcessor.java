package com.lld.design.patterns.factory.abstractfactory.document.processor;

import com.lld.design.patterns.factory.abstractfactory.document.DocumentType;

public abstract class DocumentProcessor {
    private String documentName;

    public DocumentProcessor(String documentName) {
        this.documentName = documentName;
    }

    public String getDocumentName() {
        return documentName;
    }

    public abstract void processDocument();

    public abstract DocumentType supportsType();

}