package com.lld.design.patterns.adapter.languagetranslator.adapter;

public class GoogleTranslationRequestInternal extends TranslationRequest {
    private double thresold;

    public GoogleTranslationRequestInternal(String text, String sourceLanguage, String targetLanguage, double thresold) {
        super(text, sourceLanguage, targetLanguage);
        this.thresold = thresold;
    }
}
