package org.example.homework1;

import org.example.homework1.enemies.Enemy;
import org.example.homework1.enemies.Troll;
import org.example.homework1.enemies.Zombie;
import org.example.homework1.heroes.Hero;

import java.util.Random;

public class Round {
    Hero hero;
    Enemy enemy;

    public Round(Hero hero, Enemy enemy) {
        this.hero = hero;
        this.enemy = enemy;
    }

    public RoundResult startFight() {
        if (!damageEnemy(hero, enemy)) {
            return RoundResult.ENEMY_DEAD;
        }
        if (!damageHero(enemy, hero)) {
            return RoundResult.HERO_DEAD;
        }
        return RoundResult.BOUGHT_LIVE;
    }

    private Boolean damageHero(Enemy striker, Hero defender) {
        striker.attackHero(defender);
        if (striker instanceof Troll) {
            ((Troll) striker).uniqueAttack(hero);
        }
        return defender.isAlive();
    }

    private Boolean damageEnemy(Hero striker, Enemy defender) {
        striker.attackEnemy(defender);
        if (defender instanceof Zombie) {
            ((Zombie) defender).chanceOfResurrection();
        }
        return defender.isAlive();
    }
}