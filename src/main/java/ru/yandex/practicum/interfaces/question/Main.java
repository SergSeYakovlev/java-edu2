package ru.yandex.practicum.interfaces.question;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static Opened can = new Can();
    static Opened bottle = new Botlle();
    public static void main(String[] args) {
        List<Opened> containers = new ArrayList<>();
        openAnyThing(can);
        openAnyThing(bottle);
        containers.add(can);
        containers.add(bottle);
        bottle.open();
    }

    static void openAnyThing(Opened container) {
        container.open();
        List<Opened> containers = new ArrayList<>();
        containers.add(container);
    }
}

class Can implements Opened {
    @Override
    public void open() {
        System.out.println("Пшшшш");
    }
    public void recycle() {
        System.out.println("Я плавлюсь...");
    }
}

class Botlle implements Opened {
    @Override
    public void open() {
        System.out.println("Чпых");
    }

    public void handOverToGlassCollectionPoint() {
        System.out.println("20 копеек");
    }
}
