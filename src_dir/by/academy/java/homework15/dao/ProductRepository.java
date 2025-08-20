package by.academy.java.homework15.dao;

import by.academy.java.homework15.model.Product;

import java.util.List;

public interface ProductRepository {
    ///crud operation
    Product create(Product product);
    Product read(int id);
    boolean update(Product product, int id);
    boolean delete(int id);

    List <Product> readAll();
}
