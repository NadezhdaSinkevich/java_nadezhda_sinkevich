package by.academy.java.homework8.compulsory;

import by.academy.java.homework8.Main;

import java.util.Arrays;

public class Port {
    String namePort;
    public Ship[] ships;

    public Port(String namePort, int countShip) {
        this.namePort = namePort;
        this.ships = new Ship[countShip];

    }

    public String getNamePort() {
        return namePort;
    }

    public void setNamePort(String namePort) {
        this.namePort = namePort;
    }

    public Ship[] getShips() {
        return ships;
    }

    public void setShips(Ship[] ships) {
        this.ships = ships;
    }

    @Override
    public String toString() {
        return "Port{" +
                "namePort='" + namePort + '\'' +
                ", ships=" + Arrays.toString(ships) +
                '}';
    }

    public void addShip (Ship ship){

        int count =0;

        while(count<=ships.length & ships[count]!=null) {
        count++;
        }
        ships[count] = ship;

    }

    public void deleteShip (String name){
        int count = 0;

        while (count < ships.length ){
            if (ships[count] != null ){
                if (ships[count].getNameShip().equals(name)){
                    ships[count] = null;
                }
            }
            count++;
        }

    }

    public void getWaterPort(){
        double vPort = 0;
        double mPort = 0;
        int q= Main.QWATER;

        for (int i = 0; i < ships.length; i++) {
            if (ships[i]!=null){
                vPort += ships[i].getWaterShip();
            }
        }
        mPort=vPort*q;
        System.out.println("mass_port= "+mPort);
    }

}
