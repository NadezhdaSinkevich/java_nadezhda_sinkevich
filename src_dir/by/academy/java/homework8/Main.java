package by.academy.java.homework8;

import by.academy.java.homework8.compulsory.AbstractContainer;
import by.academy.java.homework8.compulsory.Deck;
import by.academy.java.homework8.compulsory.Port;
import by.academy.java.homework8.compulsory.Ship;
import by.academy.java.homework8.compulsory.container.ContainerCone;
import by.academy.java.homework8.compulsory.container.ContainerCube;
import by.academy.java.homework8.compulsory.container.ContainerСylinder;



public class Main {
    public final static int QWATER = 1;
    public final static int DIAGONALBIG = 20;
    public final static int DIAGONALSMALL = 10;

    public static void main(String[] args) {



        Port port = new Port("port",5);
        System.out.println(port);

        Ship ship1 = new Ship("ship1", 2);
        port.addShip(ship1);

        Ship ship2 = new Ship("ship2", 1);
        port.addShip(ship2);

        Deck deck1 = new Deck("deck1",2);
        ship1.addDeck(deck1);

        Deck deck2 = new Deck("deck2",1);
        ship2.addDeck(deck2);

        AbstractContainer container1 = new ContainerCone(DIAGONALSMALL,DIAGONALSMALL,1,true,QWATER);
        AbstractContainer container2 = new ContainerCube(DIAGONALSMALL,DIAGONALSMALL,1,true,QWATER);
        AbstractContainer container3 = new ContainerСylinder(DIAGONALBIG,DIAGONALBIG,1,false,QWATER);

        deck1.addContainer(container1);
        deck1.addContainer(container2);

        deck2.addContainer(container3);

        System.out.println(port);

        port.getWaterPort();


        port.deleteShip("ship1");
        System.out.println(port);

    }




}

