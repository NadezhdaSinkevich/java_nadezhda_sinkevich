package by.academy.java.exs_add.add2;

public class Box {
    double height;
    double weight;
    double depth;

    public Box(double height, double weight, double depth) {
        this.height = height;
        this.weight = weight;
        this.depth = depth;
    }
    public Box (){

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }
    double getVolume(){
        return height*weight*depth;
    }
}
