package edu.headfirst.designpatterns.strategy;

/**
 * @author frfontoura
 * @version 1.0 04/03/2020
 */
public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squeak!");
    }

}
