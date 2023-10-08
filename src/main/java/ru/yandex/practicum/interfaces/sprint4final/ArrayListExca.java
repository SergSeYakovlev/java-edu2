package ru.yandex.practicum.interfaces.sprint4final;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExca {
    public static void main(String[] args) {
        List<String> Pro = new ArrayList<>();
        Pro.add("PythonPro");
        Pro.add("JavaPro");
        Pro.add("C#Pro");
        Pro.add("1C#Pro");
        System.out.println("Create ArrayList: " + Pro);
        Pro.remove("PythonPro");
        System.out.println("Remove ArrayList element: " + Pro);

        Pro.set(1,"Niha");
        System.out.println("Modify ArrayList: " + Pro);

        System.out.println("===================================================");

        List<String> myGroup=new LinkedList<>();

        myGroup.add("Pohekar");
        myGroup.add("Sumedh");
        myGroup.add("Nikir");
        myGroup.add("1C#Pro");
        System.out.println("Create LinkedList: " + myGroup);

        myGroup.remove("Pohekar");
        System.out.println("Remove LinkedList element: " + myGroup);

        myGroup.set(1,"Niha");
        System.out.println("Modify LinkedList: " + myGroup);
    }
}
