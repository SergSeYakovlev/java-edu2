package ru.yandex.practicum.theme22.lesson8;

import java.util.List;
import java.util.ArrayList;

// Ограничьте класс ContactBook так, чтобы он мог хранить в себе только список контактов
public class ContactBook<T extends Contact> {
    // Объявите поле класса contacts - список контактов книги
    private List<T> contacts = new ArrayList<>();

    public void addContact(T contact) {
        contacts.add(contact);
    }

    public void congratulate(String name) {
        boolean contactPresented = false; //проверяем есть ли контакт в базе
        // Найдите контакт в книге по имени, и отправьте ему сообщение с помощью метода sendMessage()
        for (T contact : contacts) {
            if (contact.getName().equals(name)) {
                System.out.println("Поздравим с Новым годом ваш контакт из записной книжки: " + name);
                contact.sendMessage();
                contactPresented = true;
            }
        }

        // Если контакт не найден, выведите соответсвующее сообщение
        if (!contactPresented) {
            System.out.println("Не найден контакт с указанным именем.");
        }
    }

    public void printList() {
        // Выведите на экран весь список контактов книги
        for (Contact contact : contacts) {
            System.out.println("Имя: " + contact.getName());
            contact.print();
        }
    }

}

