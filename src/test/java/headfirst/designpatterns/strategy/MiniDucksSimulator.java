package headfirst.designpatterns.strategy;

import edu.headfirst.designpatterns.strategy.Duck;
import edu.headfirst.designpatterns.strategy.MallardDuck;

import javax.swing.text.StyleContext;

/**
 * @author frfontoura
 * @version 1.0 04/03/2020
 */
public class MiniDucksSimulator {

    public static void main(String[] args) {
        final Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();
    }
    
}
