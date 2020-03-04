package edu.headfirst.designpatterns.strategy.characters;

import edu.headfirst.designpatterns.strategy.characters.weapon.KnifeBehavior;

/**
 * @author frfontoura
 * @version 1.0 04/03/2020
 */
public class Queen extends Character {

    public Queen(){
        weaponBehavior = new KnifeBehavior();
    }
}
