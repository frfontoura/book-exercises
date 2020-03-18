package edu.headfirst.designpatterns.factory.pizza;

/**
 * @author frfontoura
 * @version 1.0 18/03/2020
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(final String item) {
        switch (item) {
            case "cheese":
                return new NYStyleCheesePizza();
            case "pepperoni":
                return new NYStylePepperoniPizza();
        }
        return null;
    }
}
