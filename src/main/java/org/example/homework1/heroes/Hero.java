package org.example.homework1.heroes;

import org.example.homework1.Mortal;
import org.example.homework1.enemies.Enemy;

public abstract class Hero implements Mortal {
    private String name;
    private int health;
    private int baseDamage;

    public Hero(String name) {
        this.name = name;
        this.health = 100;
        this.baseDamage = 1;
    }

    public Hero(String name, int health, int baseDamage) {
        this.name = name;
        this.health = health;
        this.baseDamage = baseDamage;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public Boolean isAlive() {
        return getHealth() > 0;
    }

    public abstract void attackEnemy(Enemy enemy);
}