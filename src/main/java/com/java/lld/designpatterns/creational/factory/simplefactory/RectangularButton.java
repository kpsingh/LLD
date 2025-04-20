package com.java.lld.designpatterns.creational.factory.simplefactory;

public class RectangularButton {
    private Double length;
    private Double width;

    void onClick() {
        System.out.println("Rectangular Button was clicked!");
    }

    void render() {
        System.out.println("Rectangle Rendered!");
    }

}
