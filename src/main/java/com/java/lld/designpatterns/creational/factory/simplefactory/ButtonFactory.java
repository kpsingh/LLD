package com.java.lld.designpatterns.creational.factory.simplefactory;

public class ButtonFactory {

    // Step 3 : Create static factory method
    public static Button createButton(ScreenSize screenSize, Double border, Double radius, Double length) {
        switch (screenSize) {
            case PHONE:
                return new RoundButton(border, radius);
            case TABLET, DESKTOP:
                return new SquareButton(border, length);
        }
        // never have the default case in switch rather use below, so that any invalid input get caught
        throw new IllegalArgumentException("Invalid Type: " + screenSize);
    }
}
