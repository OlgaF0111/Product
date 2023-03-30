package org.example.Product;
public class Repository {
    Product[] products = new Product[0];  //массив храняший все продукты размер 0

    // возвращает все продукты (книги, смартфоны) массива
    public Product[] findAll() {
        return products;
    }

    // метод добавления продукта (книги, смартфоны) в репозиторий
    public void add(Product product) {
        Product[] tmp = new Product[products.length + 1]; // новый массив
        for (int i = 0; i < products.length; i++) {
            tmp[i] = products[i]; // в i ячеку нового массива сохр. i ячейку Продактс
        }
        tmp[tmp.length - 1] = product; // последняя ячейка нового массива = перемен.Продактс
        products = tmp; // перезаписываем переменную сохраняя ссылку на переменн.нового массива
    }

//метод удаления продукта по идентификатору
    public void removeById(int removeId) {
        Product[] tmp = new Product[products.length - 1];
        int index = 0;
        for (Product product : products) {
            if (product.getId() != removeId) {
                tmp[index] = product;
                index++;
            }
        }
        products = tmp;
    }
}
