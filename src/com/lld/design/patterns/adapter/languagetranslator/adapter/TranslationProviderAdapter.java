package com.lld.design.patterns.adapter.languagetranslator.adapter;

import java.util.List;

public interface TranslationProviderAdapter {

    String convert(TranslationRequest request);

    List<String> getSupportedLanguages();
}
