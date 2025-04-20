package com.java.lld.designpatterns.creational.factory.factorymethod;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ButtonContext {
    private Double border;
    private Double radius;
    private Double length;
    private ScreenSize screenSize;
}
