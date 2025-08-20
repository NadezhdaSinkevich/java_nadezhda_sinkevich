package by.academy.java.exs_add.about_interface;

public class Book implements Inter{

    String name;
    int year;

    public Book(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public void printing(){
        System.out.println(name+" "+year);
    }

}
