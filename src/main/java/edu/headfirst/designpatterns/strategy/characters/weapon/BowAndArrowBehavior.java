package edu.headfirst.designpatterns.strategy.characters.weapon;

/**
 * @author frfontoura
 * @version 1.0 04/03/2020
 */
public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("This is a Bow and Arrow");
    }
}
