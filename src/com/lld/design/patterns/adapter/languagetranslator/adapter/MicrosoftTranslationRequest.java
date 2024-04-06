package com.lld.design.patterns.adapter.languagetranslator.adapter;

import com.lld.design.patterns.adapter.languagetranslator.adapter.TranslationRequest;

public class MicrosoftTranslationRequest extends TranslationRequest {
    public MicrosoftTranslationRequest(String text, String sourceLanguage, String targetLanguage) {
        super(text, sourceLanguage, targetLanguage);
    }
}
