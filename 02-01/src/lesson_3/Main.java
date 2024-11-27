package lesson_3;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
//        String[] strings = {"Ololo1", "Ololo2", "Ololo2", "Ololo3", "Ololo4", "Ololo4", "Ololo5", "Ololo5", "Ololo5", "Ololo6", "Ololo7"};
//        for (String s :
//                strings) {
//            System.out.println(s);
//        }
//        HashMap<String, Integer> words = new HashMap<>();
//        for (String s :
//                strings) {
//            words.put(s, words.get(s) == null ? 1 : words.get(s) + 1 );
////            if (words.containsKey(s)) {
////                words.put(s, words.get(s) + 1);
////            } else {
////                words.put(s, 1);
////            }
//        }
//        for (Map.Entry<String, Integer> e:
//             words.entrySet()) {
//            System.out.println(e.getKey() + " " + e.getValue());
//        }
//        System.out.println(words.get("asd"));
//        System.out.println(words.get("Ololo5"));
//
//        PhoneBook phoneBook = new PhoneBook();
//        System.out.println(phoneBook.get("Ololo"));
//        phoneBook.add("Oll", "789");
//        phoneBook.add("Oll", "7849");
//        phoneBook.add("Oll", "7589");
//        phoneBook.add("Oll1");
//        System.out.println(phoneBook.get("Olkl"));
//        if (1==1)
//            System.out.println("");
//            System.out.println("");
//            System.out.println("");
//
//        String s1 = new String("Ololo");
//        String s2 = "Ololo";
//        System.out.println(s1==s2);
//        HashMap<String, String> hashMap = new HashMap<>();
//        hashMap.put("Ololo", "Ass");
//        System.out.println(hashMap.getOrDefault("Ololo", "Ololo1"));
//        System.out.println(hashMap.values());
//        System.out.println(hashMap.get("Ololo"));
        LinkedList<String> strings = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            strings.add("Намба " + i);
        }
        strings.remove(3);
        System.out.println(strings.size());
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.indexOf("Намба " +i));
        }
        System.out.println(strings);
    }
}
