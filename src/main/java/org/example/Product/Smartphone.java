package org.example.Product;
public class Smartphone extends Product {
    private String vendor;

    public Smartphone(int id, String name, int price, String vendor) {  // консутркто с 4 значениями
        super(id, name, price);  //геттеры этих полей наследуются от Продакт
        this.vendor = vendor;
    }

    public String getVendor() {
        return vendor;  // геттер только одного поля
    }
}
