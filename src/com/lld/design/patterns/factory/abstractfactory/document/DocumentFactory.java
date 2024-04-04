package com.lld.design.patterns.factory.abstractfactory.document;

import com.lld.design.patterns.factory.abstractfactory.document.parser.DocumentParser;
import com.lld.design.patterns.factory.abstractfactory.document.printer.DocumentPrinter;
import com.lld.design.patterns.factory.abstractfactory.document.processor.DocumentProcessor;

public abstract class DocumentFactory {

    public abstract DocumentType supportsType();

    // add all the methods which needed for processing a document
    public abstract DocumentParser createDocumentParser(String path);
    public abstract DocumentPrinter createDocumentPrinter(DocumentProcessor processor);
    public abstract DocumentProcessor createDocumentProcessor(String documentName);


}