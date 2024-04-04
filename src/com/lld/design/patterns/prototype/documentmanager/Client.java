package com.lld.design.patterns.prototype.documentmanager;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        DocumentManager documentManager = new DocumentManager();
        
        Letter letter = (Letter) documentManager.clone("letter");
        letter.setRecipient("Prasoon");

        Report report = (Report) documentManager.clone("report");
        report.setAuthor("Om Swami");

        System.out.println(letter);
        System.out.println(report);



    }
}
