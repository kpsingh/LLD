package com.lld.design.patterns.adapter.languagetranslator.adapter;

import com.lld.design.patterns.adapter.languagetranslator.external.GoogleTranslateApi;

import java.util.List;

public class GoogleTranslationProviderAdapter implements  TranslationProviderAdapter{

    GoogleTranslateApi googleTranslateApi = new GoogleTranslateApi();

    @Override
    public String convert(TranslationRequest request) {
        return googleTranslateApi.convert((GoogleTranslationRequest) request);
    }

    @Override
    public List<String> getSupportedLanguages() {
        return googleTranslateApi.getLanguages();
    }
}
