package by.academy.java.exs_add.add2;

public class Main {
    public static void main(String[] args){
        Box box = new Box(10,10,10);
        Box colorBox = new ColorBox(10,12,10,"blue");
        HeawyrBox heawyrBox = new HeawyrBox(10,10,10,10);

        System.out.println("box="+box.getVolume());
        System.out.println("colorbox="+colorBox.getVolume());

        Shipment ship = new Shipment(1,2,3,4,5);

        System.out.println("ship="+ship.height+ship.weight+ship.depth+ship.heft+ship.cost);
    }
}
