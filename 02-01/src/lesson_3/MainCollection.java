package Lesson_3;

import java.util.*;

public class MainCollection {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
//        int[] arr2 = new int[10];
//
//        System.arraycopy(arr,0,arr2,0,arr.length);
//
//        System.out.println(Arrays.toString(arr2));


//        ArrayList<Integer> al = new ArrayList<>(200000);
//
//        System.out.println(al.size());
//
//        al.add(1);
//        al.add(2);
//        al.add(0,3);
//        al.add(4);
//      //  al.remove((Integer) 2);
//
//        al.get(2);
//
//        al.trimToSize();
//
//        if (al.contains(10)) {
//            System.out.println("Содержит 1");
//        }
//
//        System.out.println(al);
//        System.out.println(al.size());



//        ArrayList<String> states = new ArrayList<>();
//
//        states.add("Германия");
//        states.add("Германия");
//        states.add("Франиция");
//        states.add("Италия");
//        states.add("Россия");
//
//        Iterator<String> iter = states.iterator();
//
//        while (iter.hasNext()) {
//            if(iter.next().equalsIgnoreCase("Германия")) {
//                iter.remove();
//            }
//        }
//        System.out.println(states);

//        for (int i = 0; i < states.size(); i++) {
//            if(states.get(i).equalsIgnoreCase("Германия")) {
//                states.remove(i);
//                i--;
//            }
//        }
//        Map<String, ArrayList<String>> map = new HashMap<>();

//        for (String state:states) {
//            if(state.equalsIgnoreCase("Германия")) {
//                states.remove(state);
//            }
//        }

       // System.out.println(states);


//        LinkedList<String> ll = new LinkedList<>();
//
//        ll.add("a");
//        ll.addFirst("o");
//        ll.addLast("z");
//
//        ll.removeLast();
//        ll.removeFirst();
//
//        ll.addFirst(ll.pollLast());

//        HashMap<String, Integer> hm = new HashMap<>();
//
//        hm.put("Васька", 1);
//        hm.put("Мурзик", 2);
//        hm.put("Рыжик", 3);
//        hm.put("Васька", 4);
//


//        Random random = new Random();
//        Map<Integer, Integer> hm = new HashMap<>();
//
//        for (int i = 0; i < 100; i++) {
//            int num = random.nextInt(10);
//            Integer res = hm.get(num);
//            hm.put(num, res == null ? 1 : res + 1);
//        }
//
//        System.out.println(hm);


//        String str1 = new String("Васька");
//        String str2 = "Васька";
//
//        System.out.println(str1.hashCode());
//        System.out.println(str2.hashCode());


//        HashSet<String> hs = new HashSet<>();
//
//        hs.add("Collection");
//        hs.add("Abcasdasdasdasdas");
//        hs.add("b");
//
//        System.out.println(hs);


//        TreeSet<Empl> ts = new TreeSet<>(new MySalaryComp());
//
//        ts.add(new Empl("Ram", 40000));
//        ts.add(new Empl("Bob", 30000));
//        ts.add(new Empl("Cris", 60000));
//        ts.add(new Empl("Tom", 20000));
//
//       //System.out.println(ts);
//
//        for (Empl e : ts) {
//            e.info();
//        }

        int id = 771;

        HashMap<Integer, String> map = iniHm();

        System.out.println(map.getOrDefault(id, "Default"));

    }


    static HashMap<Integer, String> iniHm() {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(771, "test1");
        hm.put(772, "test2");
        return hm;
    }


}

class MySalaryComp implements Comparator<Empl> {

    @Override
    public int compare(Empl o1, Empl o2) {
       if (o1.getSalary() > o2.getSalary()) {
           return 1;
       } else {
           return -1;
       }
    }
}

class Empl {
    private String name;
    private int salary;

    public Empl(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void info() {
        System.out.println(name + " " + salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

















class Box {
    String color;
    int size;

    public Box(String color, int size) {
        this.color = color;
        this.size = size;
    }
}

class MainBox {
    public static void main(String[] args) {
        Box box1 = new Box("red", 5);
        Box box2 = new Box("red", 5);

        System.out.println(box1.equals(box2));
        System.out.println(box1.hashCode());
        System.out.println(box2.hashCode());
    }
}












