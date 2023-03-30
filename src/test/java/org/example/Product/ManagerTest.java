package org.example.Product;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {
    // возвращаем весь массив книг
    @Test
    public void AddAllBooks() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Book book1 = new Book(10, "Три товарища", 1000, "Ремарк");
        Book book2 = new Book(20, "Семь лет в Тибете", 2000, "Харрер");
        Book book3 = new Book(30, "Тринадцатая сказка", 3000, "Сеттерфилд");
        Book book4 = new Book(40, "Сто лет одиночества", 4000, "Маркес");
        Book book5 = new Book(50, "Три мушкетера", 5000, "Дюма");

        manager.add(book1); // добавляем книги в менеджер
        manager.add(book2);
        manager.add(book3);
        manager.add(book4);
        manager.add(book5);

        Product[] actual = {book1, book2, book3, book4, book5};
        Product[] expected = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    // тест. класов эквивал
    @Test
    public void averageValue() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Book book1 = new Book(10, "Три товарища", 1000, "Ремарк");
        Book book2 = new Book(20, "Семь лет в Тибете", 2000, "Харрер");
        Book book3 = new Book(30, "Тринадцатая сказка", 3000, "Сеттерфилд");
        Book book4 = new Book(40, "Сто лет одиночества", 4000, "Маркес");
        Book book5 = new Book(50, "Три мушкетера", 5000, "Дюма");

        manager.add(book3);

        Product[] actual = {book3};
        Product[] expected = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    // возвращаем первую книгу из массива
    @Test
    public void returnOneBook() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Book book1 = new Book(10, "Три товарища", 1000, "Ремарк");
        Book book2 = new Book(20, "Семь лет в Тибете", 2000, "Харрер");
        Book book3 = new Book(30, "Тринадцатая сказка", 3000, "Сеттерфилд");
        Book book4 = new Book(40, "Сто лет одиночества", 4000, "Маркес");
        Book book5 = new Book(50, "Три мушкетера", 5000, "Дюма");

        manager.add(book1);

        Product[] actual = {book1};
        Product[] expected = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    // возвращаем последнюю книгу из массива
    @Test
    public void theLastBookFromTheArray() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Book book1 = new Book(10, "Три товарища", 1000, "Ремарк");
        Book book2 = new Book(20, "Семь лет в Тибете", 2000, "Харрер");
        Book book3 = new Book(30, "Тринадцатая сказка", 3000, "Сеттерфилд");
        Book book4 = new Book(40, "Сто лет одиночества", 4000, "Маркес");
        Book book5 = new Book(50, "Три мушкетера", 5000, "Дюма");

        manager.add(book5);

        Product[] actual = {book5};
        Product[] expected = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    //поиск нескольких книг по запросу
    @Test
    public void searchForBooksByName() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Book book1 = new Book(10, "Три товарища", 1000, "Ремарк");
        Book book2 = new Book(20, "Семь лет в Тибете", 2000, "Харрер");
        Book book3 = new Book(30, "Тринадцатая сказка", 3000, "Сеттерфилд");
        Book book4 = new Book(40, "Сто лет одиночества", 4000, "Маркес");
        Book book5 = new Book(50, "Три мушкетера", 5000, "Дюма");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(book4);
        manager.add(book5);

        Product[] actual = {book1, book3, book5};
        Product[] expected = manager.searchBy("Три");
        Assertions.assertArrayEquals(expected, actual);
    }

    // поиск одной книги по ключевому слову
    @Test
    public void searchForOneBookByName() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Book book1 = new Book(10, "Три товарища", 1000, "Ремарк");
        Book book2 = new Book(20, "Семь лет в Тибете", 2000, "Харрер");
        Book book3 = new Book(30, "Тринадцатая сказка", 3000, "Сеттерфилд");
        Book book4 = new Book(40, "Сто лет одиночества", 4000, "Маркес");
        Book book5 = new Book(50, "Три мушкетера", 5000, "Дюма");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(book4);
        manager.add(book5);

        Product[] actual = {book2};
        Product[] expected = manager.searchBy("Семь");
        Assertions.assertArrayEquals(expected, actual);
    }

    // не найдена ни одна книга по ключевому слову
    @Test
    public void noBooksFound() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Book book1 = new Book(10, "Три товарища", 1000, "Ремарк");
        Book book2 = new Book(20, "Семь лет в Тибете", 2000, "Харрер");
        Book book3 = new Book(30, "Тринадцатая сказка", 3000, "Сеттерфилд");
        Book book4 = new Book(40, "Сто лет одиночества", 4000, "Маркес");
        Book book5 = new Book(50, "Три мушкетера", 5000, "Дюма");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(book4);
        manager.add(book5);

        Product[] actual = {};
        Product[] expected = manager.searchBy("Мушкет");
        Assertions.assertArrayEquals(expected, actual);
    }


    // возвращаем весь массив смартфонов
    @Test
    public void AddAllSmartphone() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Smartphone smartphone1 = new Smartphone(5, "Asus", 1000, "K");
        Smartphone smartphone2 = new Smartphone(10, "Alcatel", 1000, "K");
        Smartphone smartphone3 = new Smartphone(15, "Apple", 1000, "K");
        Smartphone smartphone4 = new Smartphone(20, "Allcall", 1000, "K");

        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);
        manager.add(smartphone4);

        Product[] actual = {smartphone1, smartphone2, smartphone3, smartphone4};
        Product[] expected = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    // класс эквивалентности смартф
    @Test
    public void averageValueSmartphone() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Smartphone smartphone1 = new Smartphone(5, "Asus", 1000, "K");
        Smartphone smartphone2 = new Smartphone(10, "Alcatel", 1000, "K");
        Smartphone smartphone3 = new Smartphone(15, "Apple", 1000, "K");
        Smartphone smartphone4 = new Smartphone(20, "Allcall", 1000, "K");

        manager.add(smartphone3);

        Product[] actual = {smartphone3};
        Product[] expected = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    // возвращаем первый смартфонов из массива
    @Test
    public void theFirstSmartphoneFromTheArray() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Smartphone smartphone1 = new Smartphone(5, "Asus", 1000, "K");
        Smartphone smartphone2 = new Smartphone(10, "Alcatel", 1000, "K");
        Smartphone smartphone3 = new Smartphone(15, "Apple", 1000, "K");
        Smartphone smartphone4 = new Smartphone(20, "Allcall", 1000, "K");

        manager.add(smartphone1);

        Product[] actual = {smartphone1};
        Product[] expected = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    // возвращаем последний смартфонов из массива
    @Test
    public void theLatestSmartphoneFromArray() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Smartphone smartphone1 = new Smartphone(5, "Asus", 1000, "K");
        Smartphone smartphone2 = new Smartphone(10, "Alcatel", 1000, "K");
        Smartphone smartphone3 = new Smartphone(15, "Apple", 1000, "K");
        Smartphone smartphone4 = new Smartphone(20, "Allcall", 1000, "K");

        manager.add(smartphone4);

        Product[] actual = {smartphone4};
        Product[] expected = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    // поиск нескольких смартфонов по ключевому слову
    @Test
    public void searchForSmartphonesByName() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Smartphone smartphone1 = new Smartphone(5, "Asus", 1000, "K");
        Smartphone smartphone2 = new Smartphone(10, "Alcatel", 1000, "K");
        Smartphone smartphone3 = new Smartphone(15, "Apple", 1000, "K");
        Smartphone smartphone4 = new Smartphone(20, "Allcall", 1000, "K");


        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);
        manager.add(smartphone4);

        Product[] actual = {smartphone2, smartphone4};
        Product[] expected = manager.searchBy("Al");
        Assertions.assertArrayEquals(expected, actual);
    }

    // поиск одного смартфона по ключ.слову
    @Test
    public void searchForOneSmartphoneByName() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Smartphone smartphone1 = new Smartphone(5, "Asus", 1000, "K");
        Smartphone smartphone2 = new Smartphone(10, "Alcatel", 1000, "K");
        Smartphone smartphone3 = new Smartphone(15, "Apple", 1000, "K");
        Smartphone smartphone4 = new Smartphone(20, "Allcall", 1000, "K");

        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);
        manager.add(smartphone4);

        Product[] actual = {smartphone1};
        Product[] expected = manager.searchBy("As");
        Assertions.assertArrayEquals(expected, actual);
    }

    // не найден ни один смартфон по названию
    @Test
    public void noSmartphoneFound() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Smartphone smartphone1 = new Smartphone(5, "Asus", 1000, "K");
        Smartphone smartphone2 = new Smartphone(10, "Alcatel", 1000, "K");
        Smartphone smartphone3 = new Smartphone(15, "Apple", 1000, "K");
        Smartphone smartphone4 = new Smartphone(20, "Allcall", 1000, "K");

        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);
        manager.add(smartphone4);

        Product[] actual = {};
        Product[] expected = manager.searchBy("apple");
        Assertions.assertArrayEquals(expected, actual);
    }

    // в менеджере ничего не лежит
    @Test
    public void thereNothingInRepo() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);

        Product[] actual = {};
        Product[] expected = repo.findAll();
        ;
        Assertions.assertArrayEquals(expected, actual);
    }
}