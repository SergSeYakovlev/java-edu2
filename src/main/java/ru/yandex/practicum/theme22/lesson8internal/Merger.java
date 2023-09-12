package ru.yandex.practicum.theme22.lesson8internal;

import java.util.List;

public class Merger<T1 extends Number, T2 extends T1> {
    public void merge(List<T1> list1, List<T2> list2, int max) {
        for (int i = 0; i < max - list1.size(); i++) {
            list1.add(list2.get(i));
        }
    }
}

