package com.design.patterns.factory.practicalfactory.bird;

public class BirdFactory {
    public static Bird createBirdOfType(BirdType birdType) {
        return switch (birdType) {
            case HEN -> new Hen();
            case PEACOCK -> new Peacock();
            case CROW -> new Crow();
            case SPARROW -> new Sparrow();
            default -> new Bird();

        };
    }

    public static Bird createBirdFromString(String bird) {
        if (bird.equalsIgnoreCase("Hen"))
            return new Hen();
        else if (bird.equalsIgnoreCase("Peacock")) {
            return new Peacock();
        } else if (bird.equalsIgnoreCase("Sparrow")) {
            return new Sparrow();
        } else if (bird.equalsIgnoreCase("Crow"))
            return new Crow();
        else
            return new Bird();
    }
}
