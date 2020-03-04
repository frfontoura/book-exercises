package edu.headfirst.designpatterns.strategy.characters;

import edu.headfirst.designpatterns.strategy.characters.weapon.AxeBehavior;

/**
 * @author frfontoura
 * @version 1.0 04/03/2020
 */
public class Troll extends Character {

    public Troll(){
        weaponBehavior = new AxeBehavior();
    }
}
