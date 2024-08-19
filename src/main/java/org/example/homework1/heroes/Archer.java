package org.example.homework1.heroes;

import org.example.homework1.Hero;

public class Archer extends Hero {
    public Archer(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        System.out.println("Archer attacks the enemy");
    }
}