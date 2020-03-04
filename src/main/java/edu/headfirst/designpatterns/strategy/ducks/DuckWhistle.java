package edu.headfirst.designpatterns.strategy.ducks;

import edu.headfirst.designpatterns.strategy.ducks.quack.Quack;
import edu.headfirst.designpatterns.strategy.ducks.quack.QuackBehavior;

/**
 * @author frfontoura
 * @version 1.0 04/03/2020
 */
public class DuckWhistle {

    QuackBehavior quackBehavior;

    public DuckWhistle() {
        quackBehavior = new Quack();
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    public void performQuack() {
        quackBehavior.quack();
    }
}
