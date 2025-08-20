package by.academy.java.homework15.dao;

import by.academy.java.homework15.model.Product;
import by.academy.java.homework15.reader.Reader;


import java.util.List;

public class ProductRepositoryImpl implements ProductRepository{
    private Reader reader;


    public ProductRepositoryImpl(Reader reader) {
        this.reader = reader;
    }


    @Override
    public Product create(Product product) {

        List<Product> products = reader.readAll();
        products.add(product);
        reader.writeAll(products);

        return null;
    }

    @Override
    public Product read(int id) {

        List<Product> products = reader.readAll();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id){
            return products.get(i);
            }

        }

        return null;
    }

    @Override
    public boolean update(Product product, int id) {
        List<Product> products = reader.readAll();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.get(i).setName(product.getName());
                products.get(i).setData(product.getData());
            }
        }
        reader.writeAll(products);
        return false;
    }

    @Override
    public boolean delete(int id) {
        List<Product> products = reader.readAll();
        products.remove(id-1);
        reader.writeAll(products);

        return false;
    }

    @Override
    public List<Product> readAll() {

        return reader.readAll();
    }
}
