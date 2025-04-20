package com.java.lld.designpatterns.creational.factory.simplefactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ButtonTest {

    @Test
    void buttonTest_v1() {
        // objects are tightly coupled. If we change the name of any one class then issues started coming
        RoundButton roundButton = new RoundButton(1.0, 2.0);
        roundButton.onClick();

        SquareButton squareButton = new SquareButton(5.0, 10.0);
        squareButton.onClick();

    }


    @Test
    void testRoundButton() {
        // loosely coupled with factory method
        Button button = ButtonFactory.createButton(ScreenSize.PHONE, 10.0, 10.0, null);

        assertTrue(button instanceof RoundButton,
                "If screen size is of phone, button should be round");

    }

    @Test
    void testSquareButton() {
        Button button = ButtonFactory.
                createButton(ScreenSize.DESKTOP, 5.0, null, 5.0);

        assertTrue(button instanceof SquareButton,
                "If the screen size is of desktop, button will be Square");
    }

    // Why the factory pattern:
    // 1. SRP and OCP : It follows (in the client code)
    // 2. Complex construction logic
    // 3. Reduce uses of subclasses

    // What is the down-size of simple factory pattern
    // 1. Parameters explosion : Use the builder pattern to reduce the
    // 2.SRP + OCP : violation in library code

}
