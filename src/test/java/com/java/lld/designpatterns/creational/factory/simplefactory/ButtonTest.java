package com.java.lld.designpatterns.creational.factory.simplefactory;

import org.junit.jupiter.api.Test;

public class ButtonTest {

    @Test
    void buttonTest(){
        RoundButton roundButton = new RoundButton(1.0, 2.0);
        roundButton.onClick();

        SquareButton squareButton = new SquareButton(5.0);
        squareButton.onClick();

    }
}
