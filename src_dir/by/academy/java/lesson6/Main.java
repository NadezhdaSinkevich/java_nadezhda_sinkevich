package by.academy.java.lesson6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args){
/*
        //split азделение на подстроки
        String text = "2025-06-02";
        String[] words = text.split("-");
        for (String word : words){
            System.out.println(word);
        }

        //matches возвращает true/false

        String input = "+375(29)123-45-67";
        //(\+*)\d{11}  для +123456789
        boolean result = input.matches("(\\+375)(\\(\\d{2}\\))(\\d{3})-(\\d{2})-(\\d{2})");
        if(result) {
            System.out.println("phone number ");
        }
        else {
            System.out.println("not phone");
        }
*/
/*
        String inputP = "Hello";
        Pattern pattern = Pattern.compile("(e)");
        Matcher matcher = pattern.matcher(inputP);
       // boolean found = matcher.matches();
        boolean found = matcher.find();
        //String res = matcher.group();//первое нахождение
        int indexStart = matcher.start();
        int indexEnd = matcher.end();


        if (found){
          // System.out.println("Найдено "+res);
           System.out.println("start with index = "+ indexStart);
           System.out.println("End = "+ indexEnd);
        }
        else {
        System.out.println("Не найдено");
        }
*/
        /*
        String input = "d s y";
        Pattern pattern = Pattern.compile("(asd|y)");
        Matcher matcher = pattern.matcher(input);
        boolean found = matcher.find();
        String res = matcher.group();
        if (found){
            System.out.println("Найдено "+res);

        }
        else {
            System.out.println("Не найдено");
        }
        */
        /*
        String input = "-S23ye4562 g78yt9";
        //Pattern pattern = Pattern.compile("[are]");// из трех символов что первое нашло, то и вывело
        //Pattern pattern = Pattern.compile("[^are]");//все , кроме are
        Pattern pattern = Pattern.compile("[A-Za-z0-9_]");
        Matcher matcher = pattern.matcher(input);
        boolean found = matcher.find();
        String res = matcher.group();
       // int ind = matcher.start();

        if (found){
            System.out.println("Найдено " + res);
          //  System.out.println("Найдено " + ind);

        }
        else {
            System.out.println("Не найдено");
        }*/
                        // gmail/mail/ya     /ru/eu/com
        String input = "alex.allw@gmail.com";
        Pattern pattern = Pattern.compile("(\\w+)\\.?@(gmail|mail|ya)\\.(com|ru|eu)");
        Matcher matcher = pattern.matcher(input);
        boolean found = matcher.find();



        if (found){
            System.out.println("Найдено " );
        }
        else {
            System.out.println("Не найдено");
        }



    }
}
