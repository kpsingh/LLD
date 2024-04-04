package com.lld.design.patterns.factory.abstractfactory.document.printer;

import com.lld.design.patterns.factory.abstractfactory.document.DocumentType;
import com.lld.design.patterns.factory.abstractfactory.document.processor.DocumentProcessor;


public abstract class DocumentPrinter {

    private final DocumentProcessor processor;

    public DocumentPrinter(DocumentProcessor processor) {
        this.processor = processor;
    }

    public DocumentProcessor getProcessor() {
        return processor;
    }

    public abstract void printDocument();

    public abstract DocumentType supportsType();

}
