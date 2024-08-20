package org.example.homework1.heroes;

import org.example.homework1.enemies.Enemy;

public class Archer extends Hero {
    public Archer(String name) {
        super(name);
    }

    public Archer(String name, int health, int baseDamage) {
        super(name, health, baseDamage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Archer attacks the enemy");
        enemy.takeDamage(getBaseDamage());
    }
}