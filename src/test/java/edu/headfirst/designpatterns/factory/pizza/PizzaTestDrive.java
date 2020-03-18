package edu.headfirst.designpatterns.factory.pizza;

/**
 * @author frfontoura
 * @version 1.0 18/03/2020
 */
public class PizzaTestDrive {

    public static void main(final String[] args) {
        final PizzaStore nyStore = new NYPizzaStore();
        final PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("pepperoni");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("pepperoni");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
