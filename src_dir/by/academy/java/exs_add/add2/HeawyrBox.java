package by.academy.java.exs_add.add2;

public class HeawyrBox extends Box{
    double heft;

    public double getHeft() {
        return heft;
    }

    public void setHeft(double heft) {
        this.heft = heft;
    }

    public HeawyrBox(double height, double weight, double depth, double heft) {
        super(height, weight, depth);
        this.heft = heft;
    }

    public HeawyrBox(double heft) {
        this.heft = heft;
    }

}
