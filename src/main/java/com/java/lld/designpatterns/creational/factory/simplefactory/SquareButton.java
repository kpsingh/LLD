package com.java.lld.designpatterns.creational.factory.simplefactory;

import com.java.lld.designpatterns.creational.builder.Database;
import lombok.AllArgsConstructor;
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
        System.out.println("onClick of SquareButton");
    }

    @Override
    public void render() {
        System.out.println("render of SquareButton");
    }
}

