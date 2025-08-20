package by.academy.java.homework15;

import by.academy.java.homework15.dao.OrderRepository;
import by.academy.java.homework15.dao.OrderRepositoryImpl;
import by.academy.java.homework15.dao.ProductRepository;
import by.academy.java.homework15.dao.ProductRepositoryImpl;
import by.academy.java.homework15.reader.ReaderOrder;
import by.academy.java.homework15.service.OrderService;
import by.academy.java.homework15.service.ProductService;
import by.academy.java.homework15.reader.Reader;
import by.academy.java.homework15.view.View;

public class Main {
    public static void main(String[] args){

        Reader reader = new Reader("C://Users//nadezhda//Desktop//filesforjava//hw//products.txt");
        ProductRepository productRepository = new ProductRepositoryImpl(reader);
        ProductService productService = new ProductService(productRepository);

        ReaderOrder reader1 = new ReaderOrder("C://Users//nadezhda//Desktop//filesforjava//hw//orders.txt");
        OrderRepository orderRepository = new OrderRepositoryImpl(reader1);
        OrderService orderService = new OrderService(orderRepository);

        View view = new View(productService,orderService);
        view.Start();







    }
}
