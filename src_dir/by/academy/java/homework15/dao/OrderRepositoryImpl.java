package by.academy.java.homework15.dao;

import by.academy.java.homework15.model.Order;
import by.academy.java.homework15.model.Product;
import by.academy.java.homework15.reader.ReaderOrder;

import java.util.List;

public class OrderRepositoryImpl implements OrderRepository{
    private ReaderOrder readerOrder;

    public OrderRepositoryImpl(ReaderOrder reader) {
        this.readerOrder = reader;
    }

    @Override
    public Order create(Order order) {
        List<Order> orders = readerOrder.readAll();
        orders.add(order);
        readerOrder.writeAll(orders);
        return null;
    }

    @Override
    public Order read(int id) {
        List<Order> orders = readerOrder.readAll();
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getId() == id){
                return orders.get(i);
            }

        }
        return null;
    }

    @Override
    public boolean update(Order order, int id) {
        List<Order> orders = readerOrder.readAll();
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getId() == id) {
                orders.get(i).setDate(order.getDate());
                orders.get(i).setProducts(order.getProducts());
            }
        }
        readerOrder.writeAll(orders);
        return false;
    }

    @Override
    public boolean delete(int id) {
        List<Order> orders = readerOrder.readAll();
        orders.remove(id-1);
        readerOrder.writeAll(orders);

        return false;
    }

    @Override
    public List<Order> readAll() {
        return readerOrder.readAll();
    }
}
