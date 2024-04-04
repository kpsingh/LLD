package com.lld.design.patterns.factory.abstractfactory.document;

import com.lld.design.patterns.factory.abstractfactory.document.parser.DocumentParser;
import com.lld.design.patterns.factory.abstractfactory.document.parser.SpreadsheetDocumentParser;
import com.lld.design.patterns.factory.abstractfactory.document.printer.DocumentPrinter;
import com.lld.design.patterns.factory.abstractfactory.document.printer.SpreadsheetDocumentPrinter;
import com.lld.design.patterns.factory.abstractfactory.document.processor.DocumentProcessor;
import com.lld.design.patterns.factory.abstractfactory.document.processor.SpreadsheetDocumentProcessor;

public class SpreadsheetDocumentFactory extends DocumentFactory{
    @Override
    public DocumentType supportsType() {
        return DocumentType.SPREAD_SHEET;
    }

    @Override
    public DocumentParser createDocumentParser(String path) {
        return new SpreadsheetDocumentParser(path);
    }

    @Override
    public DocumentPrinter createDocumentPrinter(DocumentProcessor processor) {
        return new SpreadsheetDocumentPrinter(processor);
    }

    @Override
    public DocumentProcessor createDocumentProcessor(String documentName) {
        return new SpreadsheetDocumentProcessor(documentName);
    }
}
