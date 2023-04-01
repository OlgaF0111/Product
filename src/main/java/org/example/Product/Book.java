package org.example.Product;

public class Book extends Product {
    private String author;

    public Book(int id, String name, int price, String author) {   // конструктор с 4 значениями
        super(id, name, price);
        this.author = author;
    }

    public String getAuthor() {

        return author;
    }
}
