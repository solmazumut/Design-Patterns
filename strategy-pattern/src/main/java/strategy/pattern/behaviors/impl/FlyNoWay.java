package strategy.pattern.behaviors.impl;

import strategy.pattern.behaviors.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Cannot Fly");
    }
}
