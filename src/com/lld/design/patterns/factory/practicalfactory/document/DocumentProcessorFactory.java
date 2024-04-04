package com.design.patterns.factory.practicalfactory.document;

public class DocumentProcessorFactory {
    public static DocumentProcessor getDocumentProcessorByType(DocumentType documentType, String documentName) {
        if (documentType == DocumentType.TEXT) {
            return new TextDocumentProcessor(documentName);
        } else if (documentType == DocumentType.SPREAD_SHEET) {
            return new SpreadsheetDocumentProcessor(documentName);
        } else if (documentType == DocumentType.PRESENTATION) {
            return new PresentationDocumentProcessor(documentName);
        } else {
            throw new IllegalArgumentException("Invalid Document Type!");
        }

    }
}
