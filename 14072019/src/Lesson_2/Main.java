package Lesson_2;

public class Main {
    public static void main(String[] args) {

//        if (Fruit.APPLE == Fruit.APPLE) {
//            System.out.println("яблоко");
//        }

//        for (Fruit o: Fruit.values()) {
//            System.out.println(o);
//        }

//        System.out.println(Fruit.valueOf("BANANA"));

        for (Fruit o : Fruit.values()) {
            System.out.println(o.getRus() + " " + o.getWeight() + " " + o.ordinal());
        }
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




