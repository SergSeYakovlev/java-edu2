package ru.yandex.practicum;

import java.util.ArrayList;
import java.util.LinkedList;

public class LostAndFoundOffice {

    // создайте список things
    ArrayList<Object> things = new ArrayList<>();
    LinkedList<Object> thingsNew = new LinkedList<>();

    // реализуйте метод put()
    void put(Object thing) {
        if (check4Put(thing)) {
            things.add(thing);
        }
    }

    // реализуйте метод check()
    boolean check(Object thing) {
        if (thing == null) {
            //System.out.println("Передана пустая ссылка на весЧь!");
            return false;
        }
        if (!things.contains(thing)) {
            //System.out.println("Такая весЧь уже была добавлена ранее!");
            return false;
        }
        return true;
    }
    boolean check4Put(Object thing) {
        if (thing == null) {
            //System.out.println("Передана пустая ссылка на весЧь!");
            return false;
        }
        if (things.contains(thing)) {
            //System.out.println("Такая весЧь уже была добавлена ранее!");
            return false;
        }
        return true;
    }

    //for (Object object : things) { // логика проверки вещи в списке
    //  if(object.equals(target)) {
    //    return true;
    //}
}

