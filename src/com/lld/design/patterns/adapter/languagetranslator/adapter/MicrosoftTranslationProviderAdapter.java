package com.lld.design.patterns.adapter.languagetranslator.adapter;

import com.lld.design.patterns.adapter.languagetranslator.external.MicrosoftTranslateApi;

import java.util.List;

public class MicrosoftTranslationProviderAdapter implements TranslationProviderAdapter{

    private MicrosoftTranslateApi microsoftTranslateApi = new MicrosoftTranslateApi();


    @Override
    public String convert(TranslationRequest request) {
        return microsoftTranslateApi.translate(request.getText(), request.sourceLanguage, request.getTargetLanguage());
    }

    @Override
    public List<String> getSupportedLanguages() {
        return microsoftTranslateApi.getSupportedLanguages();
    }
}
