package Lesson_2;

import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) throws ArithmeticException {

//        if (Fruit.APPLE == Fruit.APPLE) {
//            System.out.println("яблоко");
//        }

//        for (Fruit o: Fruit.values()) {
//            System.out.println(o);
//        }

//        System.out.println(Fruit.valueOf("BANANA"));

//        for (Fruit o : Fruit.values()) {
//            System.out.println(o.getRus() + " " + o.getWeight() + " " + o.ordinal());
//            System.out.println(o.name());
//        }
        try {
            int i = 2 / 1;

        }
        catch (ArithmeticException e){
            System.out.println("Учи математеку");
        }
        ololo();
        try {
            throw new ArithmeticException();
        }
        catch (ArithmeticException e){
            System.out.println("ololo2");
        }
    }
    public static void ololo() {
//        try {
            throw new ArithmeticException();
//        }
//        catch (ArithmeticException e){
//            System.out.println("catched");
//        }
    }

}

enum Fruit {
    ORANGE("Апельсин", 3), APPLE("Яблоко", 1), BANANA("Банан", 5), CHERRY("Вишня", 2);

    private String rus;
    private int weight;

    Fruit(String rus, int weight) {
        this.rus = rus;
        this.weight = weight;
    }

    public String getRus() {
        return rus;
    }

    public int getWeight() {
        return weight;
    }
}




