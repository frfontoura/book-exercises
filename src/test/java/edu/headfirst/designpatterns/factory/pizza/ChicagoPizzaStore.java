package edu.headfirst.designpatterns.factory.pizza;

/**
 * @author frfontoura
 * @version 1.0 18/03/2020
 */
public class ChicagoPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(final String item) {
        switch (item) {
            case "cheese":
                return new ChicagoStyleCheesePizza();
            case "pepperoni":
                return new ChicagoStylePepperoniPizza();
        }
        return null;
    }
}
