package com.thoughtworks.learning.decorator_pattern;

public class Strawberry extends IceCream{

    public Strawberry(int scoops) {
        this.scoops = scoops;
    }

    public String description() {
        return "You have chosen Strawberry with "+scoops+" scoops!!!";
    }

    public float cost(){
        return scoops * 100;
    }
}