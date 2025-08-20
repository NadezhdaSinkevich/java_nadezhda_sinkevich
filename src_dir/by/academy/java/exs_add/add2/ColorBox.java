package by.academy.java.exs_add.add2;

public class ColorBox extends Box{
    String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ColorBox(double height, double weight, double depth, String color) {
        super(height, weight, depth);
        this.color = color;
    }

    public ColorBox(String color) {
        this.color = color;
    }
}
