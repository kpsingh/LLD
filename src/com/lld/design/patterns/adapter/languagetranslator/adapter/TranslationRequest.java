package com.lld.design.patterns.adapter.languagetranslator.adapter;

public class TranslationRequest {
    public String text;
    public String sourceLanguage;
    public String targetLanguage;

    public TranslationRequest(String text, String sourceLanguage, String targetLanguage) {
        this.text = text;
        this.sourceLanguage = sourceLanguage;
        this.targetLanguage = targetLanguage;
    }

    public String getText() {
        return text;
    }

    public String getSourceLanguage() {
        return sourceLanguage;
    }

    public String getTargetLanguage() {
        return targetLanguage;
    }
}
