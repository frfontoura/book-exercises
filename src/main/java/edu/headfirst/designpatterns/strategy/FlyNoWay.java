package edu.headfirst.designpatterns.strategy;

/**
 * @author frfontoura
 * @version 1.0 04/03/2020
 */
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }

}
