package org.example.homework1;

import org.example.homework1.enemies.Enemy;
import org.example.homework1.enemies.Zombie;
import org.example.homework1.heroes.Archer;
import org.example.homework1.heroes.Mage;
import org.example.homework1.heroes.Warrior;

public class TrainingGround {
    public static void main(String[] args) {

        Enemy enemy = new Zombie(100, 5);

        Archer archer = new Archer("Archer");
        archer.attackEnemy(enemy);
        //Health enemy's - 86

        Mage mage = new Mage("Mage");
        mage.attackEnemy(enemy);
        //Health enemy's - 76

        Warrior warrior = new Warrior("Warrior");
        warrior.attackEnemy(enemy);
        //Health enemy's - 64

        System.out.printf("Enemy health: %s\n", enemy.getHealth());

        System.out.println("Enemy" + (enemy.isAlive() ? " alive" : " dead"));
    }
}