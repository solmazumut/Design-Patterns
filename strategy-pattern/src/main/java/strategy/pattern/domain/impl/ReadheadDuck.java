package strategy.pattern.domain.impl;

import strategy.pattern.behaviors.impl.FlyWithWings;
import strategy.pattern.behaviors.impl.Quack;

public class ReadheadDuck extends Duck{
    public ReadheadDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }
    @Override
    public void display() {
        System.out.println("Readhead Duck");
        System.out.print("--");
        performFly();
        System.out.print("--");
        performQuack();
        System.out.println("*********************");
    }
}
