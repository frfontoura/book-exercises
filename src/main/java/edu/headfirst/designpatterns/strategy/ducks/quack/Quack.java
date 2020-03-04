package edu.headfirst.designpatterns.strategy.ducks.quack;

/**
 * @author frfontoura
 * @version 1.0 04/03/2020
 */
public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack!");
    }

}
