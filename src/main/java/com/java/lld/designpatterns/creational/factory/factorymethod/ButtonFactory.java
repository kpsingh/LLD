package com.java.lld.designpatterns.creational.factory.factorymethod;

import com.java.lld.designpatterns.creational.factory.simplefactory.ScreenSize;

// Step 3 : Create the main factory interface
public interface ButtonFactory {
    // Factory Method - simplified to focus on creation logic without exposing implementation details
    Button createButton();

    // Method to set context for button creation
    ButtonFactory withContext(ButtonContext context);
}

