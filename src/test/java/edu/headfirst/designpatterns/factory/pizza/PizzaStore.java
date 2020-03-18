package edu.headfirst.designpatterns.factory.pizza;

/**
 * @author frfontoura
 * @version 1.0 18/03/2020
 */
public abstract class PizzaStore {

    public Pizza orderPizza(final String type) {
        final Pizza pizza = createPizza(type);
        System.out.println("<--- Making a " + pizza.getName() + " --->");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract Pizza createPizza(String item);
}
