package com.java.lld.designpatterns.creational.factory.factorymethod;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ButtonFactoryTest {
    private ButtonContext roundContext;
    private ButtonContext squareContext;

    @BeforeEach
    void setUp() {
        roundContext = ButtonContext.builder()
                .border(2.0)
                .radius(10.0)
                .screenSize(ScreenSize.DESKTOP)
                .build();

        squareContext = ButtonContext.builder()
                .border(1.5)
                .length(20.0)
                .screenSize(ScreenSize.DESKTOP)
                .build();
    }

    @Test
    @DisplayName("RoundButtonFactory should create a RoundButton instance")
    void roundButtonFactoryCreatesRoundButton() {
        // Given
        ButtonFactory factory = new RoundButtonFactory();

        // When
        Button button = factory.withContext(roundContext).createButton();

        // Then
        assertTrue(button instanceof RoundButton);
        assertEquals(2.0, button.getBorder());
        assertEquals(10.0, ((RoundButton) button).getRadius());
    }

    @Test
    @DisplayName("SquareButtonFactory should create a SquareButton instance")
    void squareButtonFactoryCreatesSquareButton() {
        // Given
        ButtonFactory factory = new SquareButtonFactory();

        // When
        Button button = factory.withContext(squareContext).createButton();

        // Then
        assertTrue(button instanceof SquareButton);
        assertEquals(1.5, button.getBorder());
        assertEquals(20.0, ((SquareButton) button).getLength());
    }

    @Test
    @DisplayName("RoundButtonFactory should adjust button size based on screen size")
    void roundButtonFactoryAdjustsForScreenSize() {
        // Given
        ButtonFactory factory = new RoundButtonFactory();

        // When - Phone size
        ButtonContext phoneContext = ButtonContext.builder()
                .border(2.0)
                .radius(10.0)
                .screenSize(ScreenSize.PHONE)
                .build();
        Button phoneButton = factory.withContext(phoneContext).createButton();

        // When - Tablet size
        ButtonContext tabletContext = ButtonContext.builder()
                .border(2.0)
                .radius(10.0)
                .screenSize(ScreenSize.TABLET)
                .build();
        Button tabletButton = factory.withContext(tabletContext).createButton();

        // Then
        assertEquals(7.0, ((RoundButton) phoneButton).getRadius());  // 10.0 * 0.7
        assertEquals(9.0, ((RoundButton) tabletButton).getRadius()); // 10.0 * 0.9
    }

    @Test
    @DisplayName("SquareButtonFactory should adjust button size based on screen size")
    void squareButtonFactoryAdjustsForScreenSize() {
        // Given
        ButtonFactory factory = new SquareButtonFactory();

        // When - Phone size
        ButtonContext phoneContext = ButtonContext.builder()
                .border(1.5)
                .length(20.0)
                .screenSize(ScreenSize.PHONE)
                .build();
        Button phoneButton = factory.withContext(phoneContext).createButton();

        // When - Tablet size
        ButtonContext tabletContext = ButtonContext.builder()
                .border(1.5)
                .length(20.0)
                .screenSize(ScreenSize.TABLET)
                .build();
        Button tabletButton = factory.withContext(tabletContext).createButton();

        // Then
        assertEquals(14.0, ((SquareButton) phoneButton).getLength());  // 20.0 * 0.7
        assertEquals(18.0, ((SquareButton) tabletButton).getLength()); // 20.0 * 0.9
    }

    @Test
    @DisplayName("Factory should throw exception when context is not set")
    void factoryThrowsExceptionWhenContextIsNotSet() {
        // Given
        ButtonFactory roundFactory = new RoundButtonFactory();
        ButtonFactory squareFactory = new SquareButtonFactory();

        // Then
        assertThrows(IllegalStateException.class, () -> roundFactory.createButton());
        assertThrows(IllegalStateException.class, () -> squareFactory.createButton());
    }

    @Test
    @DisplayName("ButtonClient should create correct button types")
    void buttonClientCreatesCorrectButtonTypes() {
        // Given
        ButtonClientToTest roundClient = new ButtonClientToTest(new RoundButtonFactory());
        ButtonClientToTest squareClient = new ButtonClientToTest(new SquareButtonFactory());

        // When
        Button roundButton = roundClient.createButton(roundContext);
        Button squareButton = squareClient.createButton(squareContext);

        // Then
        assertTrue(roundButton instanceof RoundButton);
        assertTrue(squareButton instanceof SquareButton);
    }
}
