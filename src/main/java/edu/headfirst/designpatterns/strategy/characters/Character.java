package edu.headfirst.designpatterns.strategy.characters;

import edu.headfirst.designpatterns.strategy.characters.weapon.WeaponBehavior;

/**
 * @author frfontoura
 * @version 1.0 04/03/2020
 */
public abstract class Character {

    WeaponBehavior weaponBehavior;

    public void fight() {
        weaponBehavior.useWeapon();
    }

    public void setWeaponBehavior(WeaponBehavior wb) {
        weaponBehavior = wb;
    }

}
