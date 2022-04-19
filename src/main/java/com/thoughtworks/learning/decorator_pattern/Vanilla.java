package com.thoughtworks.learning.decorator_pattern;

public class Vanilla extends IceCream{

    public Vanilla(int scoops) {
        this.scoops = scoops;
    }

    public String description() {
        return "You have chosen Vanilla with "+scoops+" scoops!!!";
    }

    public float cost(){
        return scoops * 50;
    }
}