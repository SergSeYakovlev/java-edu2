package ru.yandex.practicum.interfaces.sprint4final;

import java.util.LinkedList;
import java.util.List;

public class LinkeddExample {

    public static void main(String[] args) {
        List<String> myGroup=new LinkedList<>();

        myGroup.add("Pohekar");
        myGroup.add("Sumedh");
        myGroup.add("Nikir");
        myGroup.add("1C#Pro");
        System.out.println("Create Group: " + myGroup);

        myGroup.remove("Pohekar");
        System.out.println("Remove Group element: " + myGroup);

        myGroup.set(1,"Niha");
        System.out.println("Modify Group: " + myGroup);

    }

}
