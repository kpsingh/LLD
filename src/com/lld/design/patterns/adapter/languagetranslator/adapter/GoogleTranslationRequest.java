package com.lld.design.patterns.adapter.languagetranslator.adapter;

import com.lld.design.patterns.adapter.languagetranslator.adapter.TranslationRequest;

public class GoogleTranslationRequest extends TranslationRequest {

    private Double confidenceThreshold;

    public GoogleTranslationRequest(String text, String sourceLanguage, String targetLanguage, Double confidenceThreshold) {
        super(text, sourceLanguage, targetLanguage);
        this.confidenceThreshold = confidenceThreshold;
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

    public Double getConfidenceThreshold() {
        return confidenceThreshold;
    }
}
