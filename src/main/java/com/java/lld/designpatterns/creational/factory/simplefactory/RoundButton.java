package com.java.lld.designpatterns.creational.factory.simplefactory;

import lombok.AllArgsConstructor;
import lombok.Getter;

// Step 2 : create the implementation classes

@Getter
public class RoundButton extends Button {
    private Double radius;

    public RoundButton(Double radius, Double border) {
        super(border);
        this.radius = radius;
    }

    @Override
    public void onClick() {
        System.out.println("Round Button was clicked!");
    }

    @Override
    public void render() {
        System.out.println("Round Rendered!");
    }


}
