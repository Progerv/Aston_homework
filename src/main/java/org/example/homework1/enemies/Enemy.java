package org.example.homework1.enemies;

import org.example.homework1.Mortal;

public class Enemy implements Mortal {

    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    @Override
    public Boolean isAlive() {
        return health > 0;
    }
}