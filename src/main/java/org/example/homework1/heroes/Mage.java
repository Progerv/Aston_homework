package org.example.homework1.heroes;

import org.example.homework1.enemies.Enemy;

public class Mage extends Hero {
    public Mage(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Mage attacks the enemy");

        enemy.takeDamage(10);
    }
}