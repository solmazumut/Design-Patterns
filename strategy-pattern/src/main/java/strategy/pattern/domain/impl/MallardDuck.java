package strategy.pattern.domain.impl;

import strategy.pattern.behaviors.impl.FlyWithWings;
import strategy.pattern.behaviors.impl.Quack;

public class MallardDuck extends Duck{

    public MallardDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }
    @Override
    public void display() {
        System.out.println("Mallard Duck");
        System.out.print("--");
        performFly();
        System.out.print("--");
        performQuack();
        System.out.println("*********************");
    }
}
