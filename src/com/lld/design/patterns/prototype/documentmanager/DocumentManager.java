package com.lld.design.patterns.prototype.documentmanager;

import javax.print.Doc;
import java.util.HashMap;
import java.util.Map;

public class DocumentManager {
    private Map<String, Document> map = new HashMap<>();

    public DocumentManager() {
        Letter letter = new Letter();
        letter.setText("Hello this is letter");
        map.put("letter", letter);

        Report report = new Report();
        report.setText("This report is written by Krishna");
        map.put("report", report);
    }

    public void addPrototype(String key, Document document) {
        map.put(key, document);
    }

    public void removePrototype(String key) {
        map.remove(key);
    }

    public Document clone(String key) throws CloneNotSupportedException {
        return (Document) map.get(key).clone();
    }
}
