package org.example.homework1.heroes;

import org.example.homework1.Hero;

public class Mage extends Hero {
    public Mage(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        System.out.println("Mage attacks the enemy");
    }
}