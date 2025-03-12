package com.java.lld.designpatterns.creational.factory.simplefactory;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SquareButton {

    private Double length;

    void onClick() {

        System.out.println("Square Button was clicked!");
    }

    void render() {
        System.out.println("Square Rendered!");
    }

}

