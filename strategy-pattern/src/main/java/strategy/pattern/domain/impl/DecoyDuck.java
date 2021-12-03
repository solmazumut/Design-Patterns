package strategy.pattern.domain.impl;

import strategy.pattern.behaviors.impl.FlyNoWay;
import strategy.pattern.behaviors.impl.FlyWithWings;
import strategy.pattern.behaviors.impl.MuteQuack;
import strategy.pattern.behaviors.impl.Quack;

public class DecoyDuck extends Duck{
    public DecoyDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }
    @Override
    public void display() {
        System.out.println("Decoy Duck");
        System.out.print("--");
        performFly();
        System.out.print("--");
        performQuack();
        System.out.println("*********************");
    }
}
