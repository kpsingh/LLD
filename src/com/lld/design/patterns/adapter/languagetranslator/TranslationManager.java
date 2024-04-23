package com.lld.design.patterns.adapter.languagetranslator;

import com.lld.design.patterns.adapter.languagetranslator.adapter.*;

public class TranslationManager {
    private TranslationProviderAdapter googleTranslateApi = new GoogleTranslationProviderAdapter();
    private TranslationProviderAdapter microsoftTranslateApi = new MicrosoftTranslationProviderAdapter();

    public String translate(String text, String sourceLanguage, String targetLanguage, String provider) {
        if (provider.equals("google")) {

            TranslationRequest request = new GoogleTranslationRequestInternal(text, sourceLanguage, targetLanguage, 0.8);
            return googleTranslateApi.convert(request);

        } else if (provider.equals("microsoft")) {

            TranslationRequest request = new MicrosoftTranslationRequest(text, sourceLanguage, targetLanguage);
            return microsoftTranslateApi.convert(request);

        } else {
            throw new RuntimeException("Invalid provider");
        }
    }
}
