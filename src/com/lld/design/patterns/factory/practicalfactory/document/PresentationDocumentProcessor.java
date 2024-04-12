package com.lld.design.patterns.factory.practicalfactory.document;

public class PresentationDocumentProcessor extends DocumentProcessor {

    public PresentationDocumentProcessor(String documentName) {
        super(documentName);
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.PRESENTATION;
    }

    @Override
    public void processDocument() {
        // Implement presentation document processing logic
        System.out.println("Processing a presentation document: " + getDocumentName());
        // Additional logic for presentation document processing
    }

    public void addSlide() {
        System.out.println("Adding a slide to the presentation.");
    }
}
