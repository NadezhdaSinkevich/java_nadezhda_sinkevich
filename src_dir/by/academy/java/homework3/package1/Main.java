package by.academy.java.homework3.package1;
import by.academy.java.homework3.package2.Rainbow;

import java.util.Scanner;

public class Main {

    public static void main(String [] args){
        int numberColor;
        String rainbowColor = "";
        do {
            numberColor = readColor();
            Rainbow rainbow = new Rainbow();
            rainbowColor += rainbow.getColorName(numberColor)+"-";
        } while (numberColor != 0);
        System.out.println(rainbowColor);
    }

    public static int readColor(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter number (1-7), 0-exit  : ");
        int num = in.nextInt();

        return num;
    }








}
