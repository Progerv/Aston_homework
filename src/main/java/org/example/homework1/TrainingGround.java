package org.example.homework1;

import org.example.homework1.heroes.Archer;
import org.example.homework1.heroes.Mage;
import org.example.homework1.heroes.Warrior;

public class TrainingGround {
    public static void main(String[] args) {

        Hero hero = new Hero("Valor");
        hero.attackEnemy();

        Archer archer = new Archer("Archer");
        archer.attackEnemy();

        Mage mage = new Mage("Mage");
        mage.attackEnemy();

        Warrior warrior = new Warrior("Warrior");
        warrior.attackEnemy();

    }
}