package strategy.pattern.behaviors.impl;

import strategy.pattern.behaviors.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Can Fly");
    }
}
