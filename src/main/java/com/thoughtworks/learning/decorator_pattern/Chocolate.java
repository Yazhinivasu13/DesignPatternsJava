package com.thoughtworks.learning.decorator_pattern;

public class Chocolate extends IceCream{

    public Chocolate(int scoops) {
        this.scoops = scoops;
    }

    public String description() {
        return "You have chosen Chocolate with "+scoops+" scoops!!!";
    }

    public float cost(){
        return scoops * 75;
    }

}
