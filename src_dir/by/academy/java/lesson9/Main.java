package by.academy.java.lesson9;


import by.academy.java.lesson8.AniFactory;
import by.academy.java.lesson8.Animal;
import by.academy.java.lesson8.Factory;

public class Main {
    public static void main(String[] args){
        //First first = new First();
        //First.Second second = new First.Second();

         String monday = Day.MONDAY.name();
         System.out.println(monday);
/*
        Color blue = Color.BLUE;

        System.out.println(blue.getCode());

        Animal cat = Factory.CAT.getAnimal();
        System.out.println(cat);


        Animal cat2 = Factory.CAT.getAnimal();

        System.out.println(cat2);*/

        Animal bill = AniFactory.CAT.action("Bill");
        Animal bill2 = AniFactory.CAT.action("Bill2");
        System.out.println(bill);
        System.out.println(bill2);


        Account<Integer> acc1 = new Account<>(2354,5000);
        int accId = (int) acc1.getId();
        System.out.println(accId);

        Account<String> acc2 = new Account<>("id2354", 5000);
        System.out.println(acc2.getId());
    }
}
