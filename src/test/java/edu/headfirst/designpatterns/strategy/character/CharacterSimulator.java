package edu.headfirst.designpatterns.strategy.character;

import edu.headfirst.designpatterns.strategy.characters.Character;
import edu.headfirst.designpatterns.strategy.characters.Knight;
import edu.headfirst.designpatterns.strategy.characters.weapon.AxeBehavior;

/**
 * @author frfontoura
 * @version 1.0 04/03/2020
 */
public class CharacterSimulator {

    public static void main(String[] args) {
        final Character character = new Knight();
        character.fight();
        character.setWeaponBehavior(new AxeBehavior());
        character.fight();
    }
}
