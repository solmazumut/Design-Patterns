package strategy.pattern.domain;

import strategy.pattern.behaviors.FlyBehavior;
import strategy.pattern.behaviors.QuackBehavior;

public interface DuckI {
    void display();
    void performFly();
    void performQuack();
    FlyBehavior getFlyBehavior();
    void setFlyBehavior(FlyBehavior flyBehavior);
    QuackBehavior getQuackBehavior();
    void setQuackBehavior(QuackBehavior quackBehavior);
}
