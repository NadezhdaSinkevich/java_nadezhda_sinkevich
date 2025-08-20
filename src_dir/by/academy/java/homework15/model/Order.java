package by.academy.java.homework15.model;

import java.util.List;

public class Order {
    private int id;
    private String date;
    private List<Product> products;

    public Order(int id, String date, List<Product> products) {
        this.id = id;
        this.date = date;
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", products=" + products +
                '}';
    }
}
