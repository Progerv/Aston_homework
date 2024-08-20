package org.example.homework1;

import org.example.homework1.enemies.Enemy;
import org.example.homework1.enemies.Troll;
import org.example.homework1.enemies.Zombie;
import org.example.homework1.heroes.Archer;
import org.example.homework1.heroes.Hero;
import org.example.homework1.heroes.Mage;
import org.example.homework1.heroes.Warrior;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BattleGround {
    public static void main(String[] args) {

        List<Enemy> enemies = new ArrayList<Enemy>();
        enemies.add(new Zombie(100, 7));
        enemies.add(new Troll(150, 12));

        List<Hero> heroes = new ArrayList<Hero>();
        heroes.add(new Warrior("Warrior", 180, 15));
        heroes.add(new Archer("Archer", 130, 17));
        heroes.add(new Mage("Mage", 100, 12));

        Boolean someoneWon = false;
        while (!someoneWon) {

            int iHero = new Random().nextInt(0, heroes.size());
            int iEnemy = new Random().nextInt(0, enemies.size());

            Round round = new Round(heroes.get(iHero), enemies.get(iEnemy));
            switch (round.startFight()) {
                case ENEMY_DEAD -> {
                    System.out.println("Enemy dead");
                    enemies.remove(iEnemy);
                }
                case HERO_DEAD -> {
                    System.out.println("Hero dead");
                    heroes.remove(iHero);
                }
            }

            if (heroes.isEmpty() || enemies.isEmpty()) {
                someoneWon = true;
            }
        }

        if (heroes.isEmpty()) {
            System.out.println("Enemies won");
        } else {
            System.out.println("Heroes won");
        }
    }
}