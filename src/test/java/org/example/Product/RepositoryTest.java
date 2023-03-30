package org.example.Product;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryTest {

    // возвращаем весь массив книг
    @Test
    public void AddAllBooks() {
        Repository repo = new Repository();
        Book book1 = new Book(10, "Три товарища", 1000, "Ремарк");
        Book book2 = new Book(20, "Семь лет в Тибете", 2000, "Харрер");
        Book book3 = new Book(30, "Тринадцатая сказка", 3000, "Сеттерфилд");
        Book book4 = new Book(40, "Сто лет одиночества", 4000, "Маркес");
        Book book5 = new Book(50, "Три мушкетера", 5000, "Дюма");

        repo.add(book1);
        repo.add(book2);
        repo.add(book3);
        repo.add(book4);
        repo.add(book5);

        Product[] actual = {book1, book2, book3, book4, book5};
        Product[] expected = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    // возвращаем одну книгу из массива
    @Test
    public void returnOneBook() {
        Repository repo = new Repository();
        Book book1 = new Book(10, "Три товарища", 1000, "Ремарк");
        Book book2 = new Book(20, "Семь лет в Тибете", 2000, "Харрер");
        Book book3 = new Book(30, "Тринадцатая сказка", 3000, "Сеттерфилд");
        Book book4 = new Book(40, "Сто лет одиночества", 4000, "Маркес");
        Book book5 = new Book(50, "Три мушкетера", 5000, "Дюма");

        repo.add(book5);

        Product[] actual = {book5};
        Product[] expected = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    // в репозитории ничего не лежит (для книг и смартфонов)
    @Test
    public void thereNothingInRepo() {
        Repository repo = new Repository();

        Product[] actual = {};
        Product[] expected = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    //удаление одной книги по ID
    @Test
    public void deletOneBookByID() {
        Repository repo = new Repository();
        Book book1 = new Book(10, "Три товарища", 1000, "Ремарк");
        Book book2 = new Book(20, "Семь лет в Тибете", 2000, "Харрер");
        Book book3 = new Book(30, "Тринадцатая сказка", 3000, "Сеттерфилд");
        Book book4 = new Book(40, "Сто лет одиночества", 4000, "Маркес");
        Book book5 = new Book(50, "Три мушкетера", 5000, "Дюма");

        repo.add(book1);
        repo.add(book2);
        repo.add(book3);
        repo.add(book4);
        repo.add(book5);
        repo.removeById(30);

        Product[] actual = {book1, book2, book4, book5};
        Product[] expected = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    ///удаление нескольких книг по ID
    @Test
    public void deletingMultipleBooksByID() {
        Repository repo = new Repository();
        Book book1 = new Book(10, "Три товарища", 1000, "Ремарк");
        Book book2 = new Book(20, "Семь лет в Тибете", 2000, "Харрер");
        Book book3 = new Book(30, "Тринадцатая сказка", 3000, "Сеттерфилд");
        Book book4 = new Book(40, "Сто лет одиночества", 4000, "Маркес");
        Book book5 = new Book(50, "Три мушкетера", 5000, "Дюма");

        repo.add(book1);
        repo.add(book2);
        repo.add(book3);
        repo.add(book4);
        repo.add(book5);
        repo.removeById(10);
        repo.removeById(30);
        repo.removeById(50);

        Product[] actual = {book2, book4};
        Product[] expected = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    // возвращаем весь массив смартфонов
    @Test
    public void AddAllSmartphone() {
        Repository repo = new Repository();
        Smartphone smartphone1 = new Smartphone(5, "Asus", 1000, "K");
        Smartphone smartphone2 = new Smartphone(10, "Alcatel", 1000, "K");
        Smartphone smartphone3 = new Smartphone(15, "Apple", 1000, "K");
        Smartphone smartphone4 = new Smartphone(20, "Allcall", 1000, "K");

        repo.add(smartphone1);
        repo.add(smartphone2);
        repo.add(smartphone3);
        repo.add(smartphone4);

        Product[] actual = {smartphone1, smartphone2, smartphone3, smartphone4};
        Product[] expected = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    // возвращаем один смартфон из массива
    @Test
    public void returnOneSmartphone() {
        Repository repo = new Repository();
        Smartphone smartphone1 = new Smartphone(5, "Asus", 1000, "K");
        Smartphone smartphone2 = new Smartphone(10, "Alcatel", 1000, "K");
        Smartphone smartphone3 = new Smartphone(15, "Apple", 1000, "K");
        Smartphone smartphone4 = new Smartphone(20, "Allcall", 1000, "K");

        repo.add(smartphone2);

        Product[] actual = {smartphone2};
        Product[] expected = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    //удаление 1 смартфона по ID
    @Test
    public void deletOneSmartphoneByID() {
        Repository repo = new Repository();
        Smartphone smartphone1 = new Smartphone(5, "Asus", 1000, "K");
        Smartphone smartphone2 = new Smartphone(10, "Alcatel", 1000, "K");
        Smartphone smartphone3 = new Smartphone(15, "Apple", 1000, "K");
        Smartphone smartphone4 = new Smartphone(20, "Allcall", 1000, "K");

        repo.add(smartphone1);
        repo.add(smartphone2);
        repo.add(smartphone3);
        repo.add(smartphone4);
        repo.removeById(5);

        Product[] actual = {smartphone2, smartphone3, smartphone4};
        Product[] expected = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    // удаление нескольких смартфонов по ID
    @Test
    public void deletingMultipleSmartphonesByID() {
        Repository repo = new Repository();
        Smartphone smartphone1 = new Smartphone(5, "Asus", 1000, "K");
        Smartphone smartphone2 = new Smartphone(10, "Alcatel", 1000, "K");
        Smartphone smartphone3 = new Smartphone(15, "Apple", 1000, "K");
        Smartphone smartphone4 = new Smartphone(20, "Allcall", 1000, "K");

        repo.add(smartphone1);
        repo.add(smartphone2);
        repo.add(smartphone3);
        repo.add(smartphone4);
        repo.removeById(10);
        repo.removeById(20);

        Product[] actual = {smartphone1, smartphone3};
        Product[] expected = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

}