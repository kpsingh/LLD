package com.lld.design.patterns.adapter.languagetranslator.adapter;

import com.lld.design.patterns.adapter.languagetranslator.external.GoogleTranslateApi;
import com.lld.design.patterns.adapter.languagetranslator.external.GoogleTranslationRequest;

import java.util.List;

public class GoogleTranslationProviderAdapter implements TranslationProviderAdapter {

    GoogleTranslateApi googleTranslateApi = new GoogleTranslateApi();

    @Override
    public String convert(TranslationRequest request) {
        GoogleTranslationRequest req = new GoogleTranslationRequest(request.getText(), request.getSourceLanguage(), request.getTargetLanguage(), 0.8);
        return googleTranslateApi.convert(req);
    }

    @Override
    public List<String> getSupportedLanguages() {
        return googleTranslateApi.getLanguages();
    }
}
