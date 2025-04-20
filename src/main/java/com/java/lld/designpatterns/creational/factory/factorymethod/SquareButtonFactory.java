package com.java.lld.designpatterns.creational.factory.factorymethod;

public class SquareButtonFactory implements ButtonFactory {

    private ButtonContext context;

    @Override
    public Button createButton() {
        if (context == null) {
            throw new IllegalStateException("Button context must be set before creation");
        }

        // Create button based on screen size
        if (context.getScreenSize() == ScreenSize.PHONE) {
            return new SquareButton(context.getBorder(), context.getLength() * 0.7); // Smaller for phones
        } else if (context.getScreenSize() == ScreenSize.TABLET) {
            return new SquareButton(context.getBorder(), context.getLength() * 0.9); // Medium for tablets
        } else {
            return new SquareButton(context.getBorder(), context.getLength()); // Default for desktop
        }
    }

    @Override
    public ButtonFactory withContext(ButtonContext context) {
        this.context = context;
        return this;
    }
}
