package edu.headfirst.designpatterns.strategy.ducks;

import edu.headfirst.designpatterns.strategy.ducks.fly.FlyBehavior;
import edu.headfirst.designpatterns.strategy.ducks.quack.QuackBehavior;

/**
 * @author frfontoura
 * @version 1.0 04/03/2020
 */
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {

    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}
