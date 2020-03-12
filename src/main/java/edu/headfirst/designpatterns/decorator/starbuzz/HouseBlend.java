package edu.headfirst.designpatterns.decorator.starbuzz;

/**
 * @author frfontoura
 * @version 1.0 12/03/2020
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
