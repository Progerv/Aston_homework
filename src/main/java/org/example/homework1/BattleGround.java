package org.example.homework1;

import org.example.homework1.enemies.Enemy;
import org.example.homework1.heroes.Archer;
import org.example.homework1.heroes.Mage;
import org.example.homework1.heroes.Warrior;

import java.util.ArrayList;

public class BattleGround {
    public static void main(String[] args) {

        ArrayList<Enemy> enemies = new ArrayList<Enemy>();
        enemies.add(new Enemy(100));
        enemies.add(new Enemy(150));
        enemies.add(new Enemy(300));

        Warrior warrior = new Warrior("Warrior");
        Archer archer = new Archer("Archer");
        Mage mage = new Mage("Mage");

        for (Enemy enemy : enemies) {
            while (enemy.isAlive()) {
                if (enemy.isAlive())
                    warrior.attackEnemy(enemy);
                if (enemy.isAlive())
                    archer.attackEnemy(enemy);
                if (enemy.isAlive())
                    mage.attackEnemy(enemy);
            }
        }

        System.out.println("Heroes won");
    }
}
