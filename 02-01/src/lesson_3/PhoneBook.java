package lesson_3;

import java.util.HashMap;
import java.util.HashSet;

public class PhoneBook {
    private HashMap<String, HashSet<String>> surnameNumber;

    public PhoneBook() {
        surnameNumber = new HashMap<>();
        surnameNumber.put("Ololo", new HashSet<String>());
        surnameNumber.get("Ololo").add("8902");
        surnameNumber.get("Ololo").add("8950");
    }

    public String get(String surname) {
        StringBuilder numbers = new StringBuilder();
        if (surnameNumber.get(surname) != null) {
            for (String s :
                    surnameNumber.get(surname)) {
                numbers.append(s + "\n");
            }
        } else {
            return "Нет таких";
        }
        return numbers.toString();
    }

    public void add(String surname) {
        if (!surnameNumber.containsKey(surname)) {
            surnameNumber.put(surname, new HashSet<>());
        } else {
            throw new RuntimeException("Такой есть уже");
        }
    }

    public void add(String surname, String number) {
        if (surnameNumber.containsKey(surname)) {
            surnameNumber.get(surname).add(number);
        } else {
            HashSet<String> numbers = new HashSet<>();
            numbers.add(number);
            surnameNumber.put(surname, numbers);
        }
    }
}
