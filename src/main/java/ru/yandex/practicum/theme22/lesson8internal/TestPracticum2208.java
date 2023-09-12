package ru.yandex.practicum.theme22.lesson8internal;

import java.util.ArrayList;
import java.util.List;

public class TestPracticum2208 {
    public static void main(String[] args) {
        List<Double> list1 = new ArrayList<>();
        List<Float> list2 = new ArrayList<>();
        Merger<Double, Float> merger = new Merger<>();
        merger.merge(list1, list2, 1);

    }

}
