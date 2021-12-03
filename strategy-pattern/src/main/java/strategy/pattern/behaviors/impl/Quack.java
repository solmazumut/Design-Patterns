package strategy.pattern.behaviors.impl;

import strategy.pattern.behaviors.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Duck Quack");
    }
}
