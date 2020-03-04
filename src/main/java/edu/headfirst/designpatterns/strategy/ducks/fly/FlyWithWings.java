package edu.headfirst.designpatterns.strategy.ducks.fly;

/**
 * @author frfontoura
 * @version 1.0 04/03/2020
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }

}
