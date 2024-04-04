package com.design.patterns.factory.practicalfactory;

import com.design.patterns.factory.practicalfactory.bird.Bird;
import com.design.patterns.factory.practicalfactory.bird.BirdFactory;
import com.design.patterns.factory.practicalfactory.bird.BirdType;

public class Client {
    public static void main(String[] args) {
        BirdType birdType = BirdType.PEACOCK;// someone has given this bird type. somehow we get this.
        Bird bird;
        bird = BirdFactory.createBirdOfType(birdType);
    }
}

