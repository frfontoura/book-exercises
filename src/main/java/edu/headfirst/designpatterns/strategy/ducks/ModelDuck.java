package edu.headfirst.designpatterns.strategy.ducks;

import edu.headfirst.designpatterns.strategy.ducks.fly.FlyNoWay;
import edu.headfirst.designpatterns.strategy.ducks.quack.Quack;

/**
 * @author frfontoura
 * @version 1.0 04/03/2020
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck!");
    }
}
