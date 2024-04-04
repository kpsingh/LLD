package com.lld.design.patterns.factory.abstractfactory.document.printer;

import com.lld.design.patterns.factory.abstractfactory.document.DocumentType;
import com.lld.design.patterns.factory.abstractfactory.document.processor.DocumentProcessor;

public class SpreadsheetDocumentPrinter extends DocumentPrinter {

    public SpreadsheetDocumentPrinter(DocumentProcessor processor) {
        super(processor);
    }

    public void printDocument() {
        // Print spreadsheet document
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.SPREAD_SHEET;
    }
}