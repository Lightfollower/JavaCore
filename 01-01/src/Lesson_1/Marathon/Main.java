package Lesson_1.Marathon;

import Lesson_1.Marathon.competitors.*;
import Lesson_1.Marathon.obstacles.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Competitor[] competitors = {new Human("Vasya"), new Dog("Grommit")};
//        new Competition(new Team(competitors), new Course()).start();

        String string1 = new String("Ololo");
//        String string2 = new String("Ololo");
        String string2 = string1;
        string1 = "xyu";
        System.out.println(string2);
        System.out.println(string1 == string2);
        System.out.println(string1.equals(string2));
        Human human1 = new Human("Vas");
        Human human2 = new Human("Sav");
        human1.i=20;
        human2.i=30;
        Human.i=35;
        System.out.println(human1.i);
        int[] ints = new int[]{1,555,2,4};
//        human1.getInts()[2] = 567;

        for (int i = 0; i < human1.getInts().length; i++) {
            System.out.println(human1.getInts()[i]);
        }
        SuperCat superCat = new SuperCat();
        superCat.name = "asd";
        superCat.ololo();
        System.out.println(superCat.name1);
        Cat cat = superCat;
        SuperCat.ZaluperCat zaluperCat = (SuperCat.ZaluperCat) cat;

    }
}

class Cat{
    static String name1= "cat";
}
class SuperCat extends Cat{
    String name = "super cat";
    public void ololo(){
        System.out.println(name1);
        System.out.println(name);
        System.out.println(super.name1);
    }
    class ZaluperCat extends Cat{
        public void ololo(){
            System.out.println("ololo");
        }
    }
}