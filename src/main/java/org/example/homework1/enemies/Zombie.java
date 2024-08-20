package org.example.homework1.enemies;

import org.example.homework1.heroes.Hero;

import java.util.Random;

public class Zombie extends Enemy {

    int HEALTH_AFTER_DEAD = 70;
    public Zombie(int health, int baseDamage) {
        super(health, baseDamage);
    }

    @Override
    public void attackHero(Hero hero) {
        System.out.println("Zombie attacks the hero");
        hero.takeDamage(getBaseDamage());
    }

    public void chanceOfResurrection() {
        if (!isAlive()) {
            int chanceTesurrect = new Random().nextInt(0, 10);
            if (chanceTesurrect == 5) {
                setHealth(HEALTH_AFTER_DEAD);
                System.out.println("Zombie resurrection");
            }
        }
    }
}