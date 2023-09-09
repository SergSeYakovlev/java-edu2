package ru.yandex.practicum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

class Animal {
    private double weight;
    private int age;

    public Animal() {
        this.weight = 0.0d;
        this.age = 0;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String say() {
        return "Мяу, гав, хрю, кря!";
    }
}

class Fox extends Animal {
    private String color;

    public Fox(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String say() {
        //return "Вжжж, " + cyrToLowerCase(super.say());
        return "Вжжж, " + super.say().toLowerCase(Locale.forLanguageTag("ru"));
    }
    // научите лису говорить

//    public static String cyrToLowerCase(String s)
//    {
//        StringBuilder buf = new StringBuilder(s.toLowerCase());
//
//        char ch;
//        char chA = 'А';
//        char cha = 'а';
//        char chYa = 'Я';
//        char chYe = 'Ё';
//        char chye = 'ё';
//        for (int k = 0, n = buf.length(); k < n; k++) {
//            ch = buf.charAt(k);
//            boolean case1 = ch >= chA && ch <= chYa;
//            boolean case2 = ch == chYe;
//            char newChar1 = (char) (ch - chA + cha);
//            char newChar2 = case2 ? chye : ch;
//            buf.setCharAt(k, case1 ? newChar1 : newChar2);
//        }
//
//        return buf.toString();
//    }
}

public class Practicum1010 {
    public static void main(String[] args) {
        Fox fox = new Fox("рыжий");

        fox.setWeight(5.93d);
        fox.setAge(5);
        System.out.println("Вес лисы - " + fox.getWeight());
        System.out.println("Возраст лисы - " + fox.getAge());
        System.out.println("Цвет лисы - " + fox.getColor());
        System.out.println("Лиса говорит - " + fox.say());


        List<Integer> qwaqwa = new ArrayList<>();
        qwaqwa.add(1);
        qwaqwa.add(4);
        qwaqwa.add(6);
        qwaqwa.add(8);
        qwaqwa.add(4);
        qwaqwa.add(6);
        int summa = 0;
        System.out.println();

    }
}