package Lesson_1.Game.Heroes;

import java.util.Random;

public class Assassin extends Hero {

    int cricitalHit;
    Random random = new Random();

    public Assassin(int heal, String name, int damage, int addHeal) {
        super(heal, name, damage, addHeal);
        this.cricitalHit = random.nextInt(20);
    }

    @Override
    public void hit(Hero hero) {
        if (hero != this) {
            if(health < 0) {
                System.out.println("Герой погиб и бить не может!");
            } else {
                hero.causeDamage(damage + cricitalHit);
            }
            System.out.println(this.name + " нанес урон " + hero.name);
        }
    }

    @Override
    public void healing(Hero hero) {
        System.out.println("Убийцы не умеют лечить!");
    }
}
