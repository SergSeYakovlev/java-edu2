package ru.yandex.practicum;


import java.util.Objects; // импортируем класс Objects

public class Book {
    public String title;
    public String author;
    public int pagesNumber;

    public Book(String title, String author, int pagesNumber) {
        this.title = title;
        this.author = author;
        this.pagesNumber = pagesNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // проверяем адреса объектов
        if (obj == null) return false; // проверяем ссылку на null
        if (this.getClass() != obj.getClass()) return false; // сравниваем классы
        Book otherBook = (Book) obj; // открываем доступ к полям другого объекта
        //Book otherBook = obj; // открываем доступ к полям другого объекта
        return Objects.equals(title, otherBook.title) && // проверяем все поля
                Objects.equals(author, otherBook.author) && // нужно логическое «и»
                (pagesNumber == otherBook.pagesNumber); // примитивы сравниваем через ==
    }

}
