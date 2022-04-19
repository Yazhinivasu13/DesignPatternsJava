package com.thoughtworks.learning.decorator_pattern;

import org.junit.jupiter.api.Test;

class IceCreamTest {

    @Test
    void shouldReturnTheCostBasedOnTheFlavourAndTheNoOfScoopsChosenByTheCustomer() {
        IceCream iceCream = new Vanilla(2);
        System.out.println(iceCream.description());
        System.out.println("Cost : Rs."+iceCream.cost());
    }
}