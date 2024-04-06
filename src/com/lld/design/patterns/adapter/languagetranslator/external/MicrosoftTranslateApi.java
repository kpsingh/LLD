package com.lld.design.patterns.adapter.languagetranslator.external;

import java.util.List;

import static com.lld.design.patterns.adapter.languagetranslator.external.ApiUtils.logMicrosoftGetSupportedLanguages;
import static com.lld.design.patterns.adapter.languagetranslator.external.ApiUtils.logMicrosoftTranslate;

public class MicrosoftTranslateApi {
    public String translate(String text, String sourceLanguage, String targetLanguage) {
        // Implementation for translating text using Microsoft Translator API
        logMicrosoftTranslate();
        return "Translated text";
    }

    // Method to retrieve the list of supported languages from Microsoft Translator
    public List<String> getSupportedLanguages() {
        // Implementation for fetching supported languages from Microsoft Translator
        logMicrosoftGetSupportedLanguages();
        return List.of("hindi", "marathi", "kannada");
    }
}