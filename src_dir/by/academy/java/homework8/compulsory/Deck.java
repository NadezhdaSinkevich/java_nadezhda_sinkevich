package by.academy.java.homework8.compulsory;

import by.academy.java.homework8.Main;

import java.util.Arrays;

public class Deck {

    String nameDeck;
    public AbstractContainer[] conteiners;

    public Deck(String nameDeck, int countConteiner) {
        this.nameDeck = nameDeck;
        this.conteiners = new AbstractContainer[countConteiner];
    }

    public String getNameDeck() {
        return nameDeck;
    }

    public void setNameDeck(String nameDeck) {
        this.nameDeck = nameDeck;
    }

    public AbstractContainer[] getConteiners() {
        return conteiners;
    }

    public void setConteiners(AbstractContainer[] conteiners) {
        this.conteiners = conteiners;
    }

    @Override
    public String toString() {
        return "Deck{" +
                "nameDeck='" + nameDeck + '\'' +
                ", conteiners=" + Arrays.toString(conteiners) +
                '}';
    }


    public void addContainer(AbstractContainer container){
        int count =0;
        int countSmall=0;
        int countBig=0;

        while(count<=conteiners.length & conteiners[count]!=null) {
            count++;
        }
        for (int i = 0; i < count; i++) {
            if (conteiners[i].isSmall()){//true small
                countSmall++;
            }
            else {
                countBig++;
            }
        }

        if (approveSize(container,countSmall,countBig)) {
            if (container.getHeight() <= 100 && container.getHeight() >= 10) {
                conteiners[count] = container;
            } else {
                System.out.println("enter 10<height <100");
            }
        }
        else {System.out.println("add 4 small or 2 big conteiners"); }


    }


    public boolean approveSize(AbstractContainer container,int countSmall,int countBig){
        boolean flag=false;
        if (container.isSmall() && countSmall < 4 && countBig==0) {
            return true;
        } else if (!container.isSmall() && countBig < 2 && countSmall ==0) {
            return true;
        }
        else {
            return false;
        }


    }

    public double getWaterDeck (){
    double vConteiners=0;
    double mConteiners=0;
    int q= Main.QWATER;


        for (int i = 0; i < conteiners.length; i++) {
            if(conteiners[i]!=null) {
                vConteiners += conteiners[i].makeVolume();

            }
        }
        mConteiners=vConteiners*q;

        //System.out.println("mass_deck= "+mConteiners);
        return mConteiners;
    }

}
