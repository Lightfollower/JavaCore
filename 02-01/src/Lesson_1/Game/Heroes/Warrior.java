package Lesson_1.Game.Heroes;

import Lesson_1.Game.Heroes.Hero;

import java.util.Random;

public class Warrior extends Hero {

    public Warrior(int health, String type, int damage, int addHeal) {
        super(health, type, damage, addHeal);
    }

    @Override
    public void hit(Hero hero) {
        if (hero != this) {
            if(health < 0) {
                System.out.println("Герой погиб и бить не может!");
            } else {
                hero.causeDamage(damage);
            }
            System.out.println(this.name + " нанес урон " + hero.name);
        }
    }

    @Override
    public void healing(Hero hero) {
        System.out.println("Войны не умеют лечить!");
    }
}


