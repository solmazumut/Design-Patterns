package strategy.pattern.domain.impl;

import strategy.pattern.behaviors.impl.FlyWithWings;
import strategy.pattern.behaviors.impl.Quack;
import strategy.pattern.behaviors.impl.Squeak;

public class RubberDuck extends Duck{
    public RubberDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Squeak());
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
