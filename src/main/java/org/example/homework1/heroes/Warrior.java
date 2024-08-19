package org.example.homework1.heroes;

import org.example.homework1.enemies.Enemy;

public class Warrior extends Hero {
    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Warrior attacks the enemy");
        enemy.takeDamage(12);
    }
}