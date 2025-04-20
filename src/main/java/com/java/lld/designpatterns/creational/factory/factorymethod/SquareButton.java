package com.java.lld.designpatterns.creational.factory.factorymethod;

import lombok.Getter;

// Step 2 : create the implementation classes
@Getter
public class SquareButton extends Button {

    private Double length;

    public SquareButton(Double border, Double length) {
        super(border);
        this.length = length;
    }

    @Override
    public void onClick() {
        System.out.println("Square Button was clicked!");
    }

    @Override
    public void render() {
        System.out.println("Square Button Rendered with length: " + length + " and border: " + border);
    }
}

