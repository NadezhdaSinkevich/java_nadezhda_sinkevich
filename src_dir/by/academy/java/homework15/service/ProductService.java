package by.academy.java.homework15.service;

import by.academy.java.homework15.dao.ProductRepository;
import by.academy.java.homework15.model.Product;

import java.util.List;

public class ProductService {
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }



    public Product create(Product product) {

        return productRepository.create(product);
    }


    public Product read(int id) {
        return productRepository.read(id);
    }


    public boolean update(Product product, int id) {
        productRepository.update(product,id);
        return false;
    }


    public boolean delete(int id) {
        productRepository.delete(id);
        return false;
    }


    public List<Product> readAll() {
        return productRepository.readAll();
    }

}
