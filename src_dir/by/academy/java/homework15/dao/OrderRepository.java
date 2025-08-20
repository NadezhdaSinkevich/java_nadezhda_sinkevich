package by.academy.java.homework15.dao;

import by.academy.java.homework15.model.Order;
import by.academy.java.homework15.model.Product;

import java.util.List;

public interface OrderRepository {
    ///crud operation
    Order create(Order order);
    Order read(int id);
    boolean update(Order order, int id);
    boolean delete(int id);

    List<Order> readAll();

}
