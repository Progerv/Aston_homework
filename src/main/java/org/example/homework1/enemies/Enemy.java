package org.example.homework1.enemies;

import org.example.homework1.Mortal;
import org.example.homework1.heroes.Hero;

public abstract class Enemy implements Mortal {

    private int health;

    public int getBaseDamage() {
        return baseDamage;
    }

    private int baseDamage;

    public Enemy(int health, int baseDamage) {
        this.health = health;
        this.baseDamage = baseDamage;
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

    public abstract void attackHero(Hero hero);
}