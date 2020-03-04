package edu.headfirst.designpatterns.strategy;

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
