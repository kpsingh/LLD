package com.java.lld.designpatterns.creational.factory.factorymethod;

public class ButtonClientToTest {
    private final ButtonFactory buttonFactory;// inhitialize by dependency injections
    public ButtonClientToTest(ButtonFactory buttonFactory) {
        this.buttonFactory = buttonFactory;
    }

    public Button createButton(ButtonContext context) {
        return buttonFactory.withContext(context).createButton();
    }

    // Code to test the factory method design pattern
    public static void main(String[] args) {

        // Crete a context to create the button
        ButtonContext buttonContext = ButtonContext.builder()
                .border(2.0)
                .length(10.0)
                .screenSize(ScreenSize.DESKTOP)
                .build();

        // Create the round Button

        ButtonClientToTest roundClient = new ButtonClientToTest(new RoundButtonFactory());
        Button  roundButton = roundClient.createButton(buttonContext);
        roundButton.onClick();
        roundButton.render();

    }
}
