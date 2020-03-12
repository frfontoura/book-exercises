package edu.headfirst.designpatterns.decorator.starbuzz;

/**
 * @author frfontoura
 * @version 1.0 12/03/2020
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
