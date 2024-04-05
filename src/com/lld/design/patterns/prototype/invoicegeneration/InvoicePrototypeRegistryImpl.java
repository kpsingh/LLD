package com.lld.design.patterns.prototype.invoicegeneration;

import java.util.HashMap;
import java.util.Map;

public class InvoicePrototypeRegistryImpl implements  InvoicePrototypeRegistry{

    Map<InvoiceType, Invoice> registry = new HashMap<>();
    @Override
    public void addPrototype(Invoice invoice) {
        registry.put(invoice.getType(), invoice);
    }

    @Override
    public Invoice getPrototype(InvoiceType type) {
        return registry.get(type);
    }

    @Override
    public Invoice clone(InvoiceType type) {
        return registry.get(type).cloneObject();
    }
}
