package by.academy.java.homework15.reader;

import by.academy.java.homework15.model.Order;
import by.academy.java.homework15.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReaderOrder {
    String path;

    public ReaderOrder(String path) {
        this.path = path;
    }

    public List<Order> readAll(){
        List<Order> orders = new ArrayList<>();


        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){

            String text;
            while ((text = bufferedReader.readLine()) != null){

                String[] orderString = text.split(";");
                String[] arrayIdProdInOrder = new String[orderString.length-2] ;

                int j=0;
                for (int i = 2; i < orderString.length; i++) {
                    arrayIdProdInOrder[j]=orderString[i];
                            j++;
                }

                List <Product> listAllProducts = new ArrayList<>();
                Reader readerProduct = new Reader("C://Users//nadezhda//Desktop//filesforjava//hw//products.txt");
                listAllProducts.addAll(readerProduct.readAll());

                List <Product> listProductsInOrder = new ArrayList<>();
                for (int i = 0; i < arrayIdProdInOrder.length; i++) {
                    //id = id
                    listProductsInOrder.add( compareIdProduct(Integer.parseInt(arrayIdProdInOrder[i]),listAllProducts) );
                }

                Order order = new Order(Integer.parseInt(orderString[0]),orderString[1],listProductsInOrder);
                orders.add(order);
            }
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        return orders;
    }

    public void writeAll(List<Order> orders){

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
            String text;



            for (int i = 0; i < orders.size(); i++) {

                List<Product> listProductsInOrder = new ArrayList<>();
                listProductsInOrder.addAll(orders.get(i).getProducts());

                String stringProductsIdInOrder = new String();
                for (int j = 0; j < listProductsInOrder.size(); j++) {
                    stringProductsIdInOrder += listProductsInOrder.get(j).getId()+";";
                }

                text = orders.get(i).getId()+";"+orders.get(i).getDate()+";"+stringProductsIdInOrder;
                bw.write(text+"\n");
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }



    public Product compareIdProduct(int id, List <Product> products) {


        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id){
                return products.get(i);
            }

        }

        return null;
    }

}
