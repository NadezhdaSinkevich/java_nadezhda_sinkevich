package by.academy.java.homework8.compulsory;

import by.academy.java.homework8.Main;

import java.util.Arrays;

public class Ship {
    String nameShip;
    Deck[] decks;

    public Ship(String nameShip, int countDeck) {
        this.nameShip = nameShip;
        this.decks = new Deck[countDeck];
    }

    public String getNameShip() {
        return nameShip;
    }

    public void setNameShip(String nameShip) {
        this.nameShip = nameShip;
    }

    public Deck[] getDecks() {
        return decks;
    }

    public void setDecks(Deck[] decks) {
        this.decks = decks;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "nameShip='" + nameShip + '\'' +
                ", decks=" + Arrays.toString(decks) +
                '}';
    }


    public void addDeck (Deck deck){

        int count =0;

        while(count<=decks.length & decks[count]!=null) {
            count++;
        }
        decks[count] = deck;

    }

    public double getWaterShip(){
        double vShip = 0;
        double mShip = 0;
        int q= Main.QWATER;

        for (int i = 0; i < decks.length; i++) {
            if (decks[i]!=null){
                vShip += decks[i].getWaterDeck();
            }
        }
        mShip=vShip*q;
        //System.out.println("mass_deck= "+mShip);
        return mShip;
    }


}
