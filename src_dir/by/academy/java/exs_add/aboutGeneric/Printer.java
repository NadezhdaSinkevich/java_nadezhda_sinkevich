package by.academy.java.exs_add.aboutGeneric;

public class Printer {
    public <T> void print(T[] items){
        for(T item: items){
            System.out.println(item);
        }
    }
}
