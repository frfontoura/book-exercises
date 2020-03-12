package edu.headfirst.designpatterns.strategy.ducks;

import edu.headfirst.designpatterns.strategy.ducks.*;
import edu.headfirst.designpatterns.strategy.ducks.fly.FlyRocketPowered;

/**
 * @author frfontoura
 * @version 1.0 04/03/2020
 */
public class MiniDucksSimulator {

    public static void main(String[] args) {
        System.out.println("Mallard Duck");
        final Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();

        System.out.println("\nModel Duck - runtime behavior change");
        final Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

        System.out.println("\nDuckWhistle");
        final DuckWhistle whistle = new DuckWhistle();
        whistle.performQuack();
    }

}
