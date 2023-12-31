package ru.yandex.practicum;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Wtf {
    private String w;
    private Map<Character, Integer> my_map = new HashMap<>();

    public Wtf(String word) {
        this.w = word;
        run_magic();
    }

    private void run_magic() {
        for (int zzz = 0; zzz < w.length(); zzz++) {
            char variable = w.charAt(zzz);
            Integer val = my_map.get(variable);
            if (val != null) {
                my_map.put(variable, val + 1);
            } else {
                my_map.put(variable, 1);
            }
        }
    }

    public void show_magic() {
        for (char charKey : my_map.keySet()) {
            System.out.println("Встречаемость символа " + charKey + " = " + my_map.get(charKey));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввведите слово => ");
        String word = scanner.nextLine();
        Wtf charactersOccurrence = new Wtf(word);
        charactersOccurrence.show_magic();
    }
}