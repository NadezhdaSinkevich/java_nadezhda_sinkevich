package by.academy.java.homework4.package1;
import by.academy.java.homework4.package2.Cat;

import java.util.Random;


public class Main {

    static public String catName;
    static public Integer catAge;
    static public String symbols = "qwertyuiopasdfghjklzxcvbnm";
    static public Random random = new Random();

    public static String generateName(){
        String nameReturn="";
        int intRandom;
        char symb;

        for (int i = 1; i < 5; i++) {
            intRandom= (int) (Math.random()*symbols.length());
            symb= symbols.charAt(intRandom);
            nameReturn += symb;
        }
        return  nameReturn;
    }

    public static Integer generateAge(){
        Integer ageReturn = random.nextInt(28)+1;
        return ageReturn;
    }

    public static void main (String[] args){

        System.out.println("first cicle ");
        int i=0;
        while (i<10){

            Cat cat = new Cat();
            System.out.println(cat.getName()+" "+cat.getAge());
            i++;

        }

        System.out.println("second cicle ");
        for (int j = 0; j < 10; j++) {
            catName=generateName();
            catAge=generateAge();

            Cat cat = new Cat();
            cat.setName(catName);
            cat.setAge(catAge);
            System.out.println(cat.getName()+" "+cat.getAge());
        }


        /*
        System.out.println("third cicle ");
        int i=0;
        do{
            catName=generateName();
            catAge=generateAge();

            Cat cat = new Cat(catName, catAge);
            System.out.println(cat.getName()+" "+cat.getAge());
            i++;
        }while (i<10);
        */


        System.out.println("forth cicle ");

        Cat[] catsArray; // создание масссива типа Cat
        catsArray = new Cat[5];
        for (Cat cat : catsArray){
            catName=generateName();
            catAge=generateAge();
            cat = new Cat();
            cat.setName(catName);
            cat.setAge(catAge);

            System.out.println(cat.getName()+" "+cat.getAge());
        }

    }

}
