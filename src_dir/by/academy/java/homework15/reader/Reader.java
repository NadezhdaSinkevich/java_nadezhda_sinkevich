package by.academy.java.homework15.reader;

import by.academy.java.homework15.model.Order;
import by.academy.java.homework15.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Reader {
    String path;

    public Reader(String path) {
        this.path = path;
    }


    public List<Product> readAll(){
        List<Product> products = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){

            String text;
            while ((text = bufferedReader.readLine()) != null){
                String[] productString = text.split(";");
                Product product = new Product(Integer.parseInt(productString[0]),productString[1],productString[2]);
                products.add(product);
            }
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        return products;
    }

    public void writeAll(List<Product> products){

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
        String text;

            for (int i = 0; i < products.size(); i++) {
               text = products.get(i).getId()+";"+products.get(i).getName()+";"+products.get(i).getData()+";";
               bw.write(text+"\n");
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
