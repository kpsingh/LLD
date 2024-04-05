package com.lld.design.patterns.prototype.invoicegeneration;

public interface InvoicePrototypeRegistry {
    void addPrototype(Invoice user);
    Invoice getPrototype(InvoiceType type);
    Invoice clone(InvoiceType type);
}
