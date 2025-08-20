package by.academy.java.lesson8;

public class Calculator {
    public static int sum (int a, int b){
        return  a+b;
    }

    public static double divide (int a, int b){
       if (b==0)
       {
           System.out.println("на 0 не делить");
           return 0;
       }

        return  a/b;
    }



}

