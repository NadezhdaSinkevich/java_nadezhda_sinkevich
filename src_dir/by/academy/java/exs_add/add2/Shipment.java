package by.academy.java.exs_add.add2;

public class Shipment extends HeawyrBox{
    public double cost;

    public Shipment(double height, double weight, double depth, double heft, double cost) {
        super(height, weight, depth, heft);
        this.cost = cost;
    }

    public Shipment(double heft, double cost) {
        super(heft);
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
