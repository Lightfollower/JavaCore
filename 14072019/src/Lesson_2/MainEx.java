package Lesson_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MainEx {
    public static void main(String[] args) {
//        a();

//        try {
//            int b = 10 / 0;
//        } catch (ArithmeticException e) {
//            e.printStackTrace();
//        }
//
//
//        System.out.println("End");

//        int a,b;
//
//        try {
//            int[] mass = {1,2,3};
//            a = 0;
//            b = 10 / a;
//            mass[20] = 20;
//        } catch (RuntimeException e) {
//            e.printStackTrace();
//        }

//        try {
//            FileInputStream fileInputStream = new FileInputStream("1.txt");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

//        throw new RuntimeException("asdsad");

       // System.out.println(sqrt(-10));

//        try {
//            someThing();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } finally {
//            System.out.println("Освобождение ресурсов!");
//        }
//        System.out.println(someThing());

//        try (FileInputStream fileInputStream = new FileInputStream("1.txt")) {
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

//    public static int sqrt(int n) {
//        if (n > 0) {
//            return n/2;
//        }
//        throw new ArithmeticException("нельзя отрицательное!");
//    }

    public static int someThing() {
        try {
            return 1;
        } finally {
            return 2;
        }
    }

//    public static void a() {
//        b();
//    }
//
//    public static void b() {
//        c();
//    }
//
//    public static void c() {
//        int b = 10 / 0;
//    }
}



class FactorialException extends Exception {
    private int num;

    public int getNum() {
        return num;
    }

    public FactorialException(String msg, int num) {
        super(msg);
        this.num = num;
    }
}

class Factorial {
    public static int getFactorial(int num) throws FactorialException {
        int res = 1;

        if(num < 1) throw new FactorialException("Число не может быть меньше 1", num);

        for (int i = 1; i <= num ; i++) {
            res *= i;
        }

        return res;
    }
}

class MainFactorialEx {
    public static void main(String[] args) {
        try {
            int res = Factorial.getFactorial(-10);
        } catch (FactorialException e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}