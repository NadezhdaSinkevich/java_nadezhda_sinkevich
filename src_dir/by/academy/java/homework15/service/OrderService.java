package by.academy.java.homework15.service;

import by.academy.java.homework15.dao.OrderRepository;
import by.academy.java.homework15.model.Order;

import java.util.List;

public class OrderService  {
   private OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order create(Order order) {
        return orderRepository.create(order);
    }


    public Order read(int id) {
        return orderRepository.read(id);
    }


    public boolean update(Order order, int id) {
        orderRepository.update(order,id);
        return false;
    }


    public boolean delete(int id) {
        orderRepository.delete(id);
        return false;
    }


    public List<Order> readAll() {
        return orderRepository.readAll();
    }
}
