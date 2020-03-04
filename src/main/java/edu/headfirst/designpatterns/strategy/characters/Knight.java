package edu.headfirst.designpatterns.strategy.characters;

import edu.headfirst.designpatterns.strategy.characters.weapon.SwordBehavior;

/**
 * @author frfontoura
 * @version 1.0 04/03/2020
 */
public class Knight extends Character {

    public Knight() {
        weaponBehavior = new SwordBehavior();
    }
}
