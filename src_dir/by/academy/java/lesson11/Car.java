package by.academy.java.lesson11;

public class Car implements Comparable<Car>{

    private String model ;
    private int year ;
    private String color ;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }

    public Car(){

        color = "white";

    }

    public int compareTo(Car o){
        //return model.compareTo(o.getModel());

        if (year > o.year){
            return 1;
        }
        if (year < o.year){
            return -1;
        }
        return 0;
    }
}
