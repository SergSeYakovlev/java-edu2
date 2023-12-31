package ru.yandex.practicum.theme22.lesson8;

public abstract class Contact {
    // Класс должен содержать одно поле - имя пользователя name
    private final String name;

    public Contact(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    // И два метода - sendMessage() для отправки сообщения и print() для печати информации о контакте
    public abstract void sendMessage();

    public abstract void print();
}
