package edu.headfirst.designpatterns.strategy.ducks;

import edu.headfirst.designpatterns.strategy.ducks.fly.FlyWithWings;
import edu.headfirst.designpatterns.strategy.ducks.quack.Quack;

/**
 * @author frfontoura
 * @version 1.0 04/03/2020
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard Duck");
    }
}
