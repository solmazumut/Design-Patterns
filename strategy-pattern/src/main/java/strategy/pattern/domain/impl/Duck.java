package strategy.pattern.domain.impl;

import strategy.pattern.behaviors.FlyBehavior;
import strategy.pattern.behaviors.QuackBehavior;
import strategy.pattern.domain.DuckI;

public abstract class Duck implements DuckI {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;
    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
