package org.example.homework1;

import org.example.homework1.enemies.Enemy;

public class Hero {
    private String name;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void attackEnemy(Enemy enemy) {
        System.out.println("Hero attacks the enemy");
        enemy.takeDamage(0);
    }
}