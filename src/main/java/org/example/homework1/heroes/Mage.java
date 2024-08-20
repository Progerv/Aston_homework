package org.example.homework1.heroes;

import org.example.homework1.enemies.Enemy;

public class Mage extends Hero {
    public Mage(String name) {
        super(name);
    }

    public Mage(String name, int health, int baseDamage) {
        super(name, health, baseDamage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Mage attacks the enemy");
        enemy.takeDamage(getBaseDamage());
    }
}