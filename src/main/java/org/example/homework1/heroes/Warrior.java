package org.example.homework1.heroes;

import org.example.homework1.Hero;

public class Warrior extends Hero {
    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        System.out.println("Warrior attacks the enemy");
    }
}