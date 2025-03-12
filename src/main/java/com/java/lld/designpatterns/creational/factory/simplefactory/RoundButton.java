package com.java.lld.designpatterns.creational.factory.simplefactory;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class RoundButton {
    private Double radius;
    private Double border;

    void onClick(){
        System.out.println("Round Button was clicked!");
    }

    void render(){
        System.out.println("Round Rendered!");
    }



}
