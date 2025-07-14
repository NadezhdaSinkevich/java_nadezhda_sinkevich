package by.academy.java.homework14;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        int result;
        int x=0;


        List <Integer> array = new ArrayList<>();
        array.add(1);
        array.add(0);

        try {
            result = array.get(0)/array.get(1);
            System.out.println(result);
        }
        catch (ArithmeticException e){
            System.out.println("нельзя делить на 0 ");
        }


        try {
            result = array.get(10);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("нельзя обратиться к данному индексу ");
        }


        try {
            x= -1;
            isPositive(x);
            result = (int) Math.sqrt(x);
            System.out.println(result);

        }
        catch (NumberException e){
            System.out.println(e.getMessage());
        }

    }
    public static void isPositive(int number)throws NumberException{
    if (number<0){
    throw new NumberException("не может быть отрицательным");
    }
    }
}
