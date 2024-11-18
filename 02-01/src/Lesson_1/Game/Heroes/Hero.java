package Lesson_1.Game.Heroes;

import java.util.ArrayList;
import java.util.Random;

public abstract class Hero {

    ArrayList<Hero> teammates;
    ArrayList<Hero> opponents;

    protected int health;
    protected String name;
    protected int damage;
    protected int addHeal;

    public Hero(int health, String name, int damage, int addHeal) {
        this.health = health;
        this.name = name;
        this.damage = damage;
        this.addHeal = addHeal;
    }

    public abstract void hit(Hero hero);

    public abstract void healing(Hero hero);

    void causeDamage(int damage) {
        if (health < 0) {
            System.out.println("Герой уже мертвый!");
        } else {
            health -= damage;
        }

    }

    public int getHealth() {
        return health;
    }

    public void addHealth(int health) {
        this.health += health;
    }

    public void info() {

        System.out.println(name + " " + (health < 0 ? "Герой мертвый" : health) + " " + damage);
    }
}