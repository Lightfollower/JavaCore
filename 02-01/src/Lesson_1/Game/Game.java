package Lesson_1.Game;

import Lesson_1.Game.Heroes.Assassin;
import Lesson_1.Game.Heroes.Doctor;
import Lesson_1.Game.Heroes.Hero;
import Lesson_1.Game.Heroes.Warrior;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

class Game {

    ArrayList<Hero> team1;
    ArrayList<Hero> team2;
    int team1Count;
    int team2Count;
    boolean gameIsFinished;

    public static void main(String[] args) {
        Game game = new Game();
        game.gameIsFinished = false;
        Random randomStep = new Random();
        Random randomHealing = new Random();
        int round = 1000;


        game.team1 = new ArrayList<>(Arrays.asList(new Hero[]{new Warrior(250, "Тигрил", 50, 0)
                , new Assassin(150, "Акали", 70, 0)
                , new Doctor(120, "Хилер1", 0, 60)}));

        game.team2 = new ArrayList<>(Arrays.asList(new Hero[]{new Warrior(290, "Минотавр", 60, 0)
                , new Assassin(160, "Джинкс", 90, 0)
                , new Doctor(110, "Хилер2", 0, 80)}));

        game.team1Count = game.team1.size();
        game.team2Count = game.team2.size();


        while (!game.gameIsFinished) {
            for (Hero h :
                    game.team1) {
                if (!(h instanceof Doctor)) {
                    Hero opponent = game.team2.get((int) (Math.random() * game.team2.size()));
                    while (opponent.getHealth() <= 0) {
                        opponent = game.team2.get((int) (Math.random() * game.team2.size()));
                    }
                    h.hit(opponent);
                    if (opponent.getHealth() <= 0) {
                        game.team2Count--;
                        if (game.team2Count == 0) {
                            game.gameIsFinished = true;
                            break;
                        }
                    } else {
                        game.team1.get((int) (Math.random() * game.team1.size()));
                    }
                }
            }
             if(game.gameIsFinished)
                 break;
            for (Hero h :
                    game.team2) {
                if (!(h instanceof Doctor)) {
                    Hero opponent = game.team1.get((int) (Math.random() * game.team1.size()));
                    while (opponent.getHealth() <= 0) {
                        opponent = game.team1.get((int) (Math.random() * game.team1.size()));
                    }
                    h.hit(opponent);
                    if (opponent.getHealth() <= 0) {
                        game.team1Count--;
                        if (game.team1Count == 0) {
                            game.gameIsFinished = true;
                            break;
                        }
                    } else {
                        game.team2.get((int) (Math.random() * game.team2.size()));
                    }
                }
            }
            for (Hero h :
                    game.team1) {
                h.info();
            }
            for (Hero h :
                    game.team2) {
                h.info();
            }

            System.out.println(game.team1Count);
            System.out.println(game.team2Count);
            System.out.println("---------------");

        }

        System.out.println("ololo");
        System.out.println(game.team1Count);
        System.out.println(game.team2Count);
    }
}