package strategy.pattern.behaviors.impl;

import strategy.pattern.behaviors.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Cannot quack");
    }
}
