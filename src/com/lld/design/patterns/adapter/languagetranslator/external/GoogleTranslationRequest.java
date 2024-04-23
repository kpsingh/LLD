package com.lld.design.patterns.adapter.languagetranslator.external;

public class GoogleTranslationRequest {
    private String text;
    private String sourceLanguage;
    private String targetLanguage;
    private Double confidenceThreshold;

    public GoogleTranslationRequest(String text, String sourceLanguage, String targetLanguage, Double confidenceThreshold) {
        this.text = text;
        this.sourceLanguage = sourceLanguage;
        this.targetLanguage = targetLanguage;
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
