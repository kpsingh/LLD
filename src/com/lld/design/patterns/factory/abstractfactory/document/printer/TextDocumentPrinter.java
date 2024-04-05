package com.lld.design.patterns.factory.abstractfactory.document.printer;


import com.lld.design.patterns.factory.abstractfactory.document.DocumentType;
import com.lld.design.patterns.factory.abstractfactory.document.processor.DocumentProcessor;

public class TextDocumentPrinter extends DocumentPrinter {

    public TextDocumentPrinter(DocumentProcessor processor) {
        super(processor);
    }

    public void printDocument() {
        // Print text document
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.TEXT;
    }
}