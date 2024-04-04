package com.lld.design.patterns.factory.abstractfactory.document;

import com.lld.design.patterns.factory.abstractfactory.document.parser.TextDocumentParser;
import com.lld.design.patterns.factory.abstractfactory.document.printer.DocumentPrinter;
import com.lld.design.patterns.factory.abstractfactory.document.printer.TextDocumentPrinter;
import com.lld.design.patterns.factory.abstractfactory.document.processor.DocumentProcessor;
import com.lld.design.patterns.factory.abstractfactory.document.processor.TextDocumentProcessor;
import com.lld.design.patterns.factory.abstractfactory.document.parser.DocumentParser;

public class TextDocumentFactory extends DocumentFactory{
    @Override
    public DocumentType supportsType() {
        return DocumentType.TEXT;
    }

    @Override
    public DocumentParser createDocumentParser(String path) {
        return new TextDocumentParser(path);
    }

    @Override
    public DocumentPrinter createDocumentPrinter(DocumentProcessor processor) {
        return new TextDocumentPrinter(processor);
    }

    @Override
    public DocumentProcessor createDocumentProcessor(String documentName) {
        return new TextDocumentProcessor(documentName);
    }
}
