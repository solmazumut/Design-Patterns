package strategy.pattern.behaviors.impl;

import strategy.pattern.behaviors.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Rubber duckie squeak");
    }
}
