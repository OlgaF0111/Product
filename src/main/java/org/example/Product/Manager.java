package org.example.Product;
public class Manager {
    Repository repository; //поле для хранения репозитория

    public Manager(Repository repository) {   // объявляем репозиторий в конструкторе
        this.repository = repository;
    }
// метод хранения всех товаров
    public void add(Product product) {
        repository.add(product);
    }
// метод поиска по ключевому слову
    public Product[] searchBy(String text) {
        Product[] result = new Product[0]; // тут будем хранить подошедшие запросу продукты
        for (Product product : repository.findAll()) {
            if (matches(product, text)) {  // передаем продукт и поисковый запрос
                Product[] tmp = new Product[result.length + 1];
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];
                }
                tmp[tmp.length - 1] = product;
                result = tmp;  // резалт ссылается на новый массив
            }
        }
        return result;
    }

    // метод соответсвия товара запросу
    public boolean matches(Product product, String search) {
        return product.getName().contains(search);  // возвращает тру или фолс
        }
    }



