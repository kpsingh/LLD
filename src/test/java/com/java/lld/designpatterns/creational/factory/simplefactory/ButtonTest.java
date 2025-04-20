package com.java.lld.designpatterns.creational.factory.simplefactory;

import org.junit.jupiter.api.Test;

public class ButtonTest {

    @Test
    void buttonTest_v1() {
        // objects are tightly coupled. If we change the name of any one class then issues started coming
        RoundButton roundButton = new RoundButton(1.0, 2.0);
        roundButton.onClick();

        SquareButton squareButton = new SquareButton(5.0, 10.0);
        squareButton.onClick();

    }


}
