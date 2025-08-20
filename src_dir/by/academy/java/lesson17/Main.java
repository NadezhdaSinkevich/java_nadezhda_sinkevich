package by.academy.java.lesson17;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args){

       LocalDateTime dataFirst = LocalDateTime.of(2025,01,01,10,10);
/*
       List<LocalDateTime> event = new ArrayList<>();

       event.set(0,dataFirst);


        for (int i = 0; i < 5 ; i++) {
            dataFirst.plusDays(3);
            dataFirst.plusHours(4);
            event.add(dataFirst);
        }


        LocalDateTime dataFive = event.get(5);
        System.out.println(dataFive);
        System.out.println(dataFive.getDayOfWeek());
*/


        for (int i = 0; i < 5; i++) {
            dataFirst.plusDays(3).plusHours(4);
        }
        System.out.println(dataFirst);
        System.out.println(dataFirst.getDayOfWeek());


        int days = 3;
        int hours = 4;


    }


}
