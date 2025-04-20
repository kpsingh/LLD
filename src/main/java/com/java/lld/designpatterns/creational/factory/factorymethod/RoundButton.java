package com.java.lld.designpatterns.creational.factory.factorymethod;

import lombok.Getter;

// Step 2 : create the implementation classes

@Getter
public class RoundButton extends Button {
    private Double radius;

    public RoundButton(Double border, Double radius) {
        super(border);
        this.radius = radius;
    }

    @Override
    public void onClick() {
        System.out.println("Round Button was clicked!");
    }

    @Override
    public void render() {
        System.out.println("Round Button Rendered with radius: " + radius + " and border: " + border);
    }

}
