package edu.headfirst.designpatterns.decorator.starbuzz;

/**
 * @author frfontoura
 * @version 1.0 12/03/2020
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
