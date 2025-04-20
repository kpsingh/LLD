package com.java.lld.designpatterns.creational.factory.simplefactory;

import lombok.AllArgsConstructor;
import lombok.Getter;

// STep 1 : create the  common interface/ abstruct class
@AllArgsConstructor
@Getter
public abstract class Button {
    public Double border;

    public abstract void onClick();

    public abstract void render();
}
