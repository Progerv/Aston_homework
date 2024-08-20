package org.example.homework1.enemies;

import org.example.homework1.heroes.Hero;

public class Troll extends Enemy {

    int COUNT_ATTACK_FOR_HAMMER = 5;
    int countAttack = 0;
    public Troll(int health, int baseDamage) {
        super(health, baseDamage);
    }

    @Override
    public void attackHero(Hero hero) {
        System.out.println("Troll attacks the hero");
        hero.takeDamage(getBaseDamage());
    }

    public void uniqueAttack(Hero hero) {
        countAttack++;
        if (countAttack == 5) {
            System.out.println("Troll hammer attacks the hero");
            hero.takeDamage(getBaseDamage() * 2);
        }
    }
}