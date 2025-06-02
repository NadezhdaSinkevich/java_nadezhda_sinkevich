package by.academy.java.homework5;
import netscape.security.UserTarget;

import java.util.Random;




public class Main {
    static public String symbols = "qwertyuiopasdfghjklzxcvbnm";
    static public String symbolsInt = "1234567890";
    static public Random random = new Random();
    final static public int LENGTH_ELEMENT=7;

    public static boolean isDouble(String str){
        try {
            Double.valueOf(str);
        }
        catch (Exception ex)
        {
            return false;
        }
        return true;
    }

    public static String generateElement(String element) {
        String nameReturn = "";
        int intRandom;
        char symb;


        for (int i = 1; i <= LENGTH_ELEMENT; i++) {
            intRandom = (int) (Math.random() * element.length());
            symb = element.charAt(intRandom);
            nameReturn += symb;
        }
        return nameReturn;
    }





    public static void main(String[] args){

        String [][] array = new String[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {


                    int number = random.nextInt(2) + 1;
                    switch (number) {
                        case 1: {
                            array[i][j] = generateElement(symbols);
                            break;
                        }
                        case 2: {
                            array[i][j] = generateElement(symbolsInt);
                            break;
                        }
                    }




            }
        }

        System.out.println("исходная матрица");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("после проверки каждого 3-его на double");

        for (int i = 0; i < 10; i++) {
            for (int j = 2; j < 10; j+=3){

                if (!isDouble(array[i][j])) {
                //if (!array[i][j].matches("\\d+\\.\\d+")){

                    Double b= Double.valueOf(generateElement(symbolsInt));
                    array[i][j] = b.toString();

                }
                else {
                    Double a = Double.valueOf(array[i][j]);
                    array[i][j] = Double.toString(a);
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();

        //прямая  диагональ
        String mainDiagonal="";
        String secondlyDiagonal="";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i==j){
                    //System.out.println (array[i][j]);
                    mainDiagonal += array[i][j] +" ";
                }
            }
        }
        System.out.println("main= "+mainDiagonal);
        System.out.println();

        int lastJ=9;

        //побочная  диагональ
        for (int i = 0; i < 10; i++) {
            for (int j = 9; j >= 0; j--) {

                if (lastJ==j) {
                    secondlyDiagonal += array[i][j] + " ";

                }
            }
            lastJ--;
        }
        System.out.println("secondly= "+secondlyDiagonal);
        System.out.println();

        if (mainDiagonal.equals(secondlyDiagonal)) {
            System.out.println("побочная и главная диагональ равны");
        }
        else {
            System.out.println("побочная и главная диагональ не равны");
        }
        System.out.println();

        //положить строку диагоналей в массив
        String diagonalsMainSecondly;
        diagonalsMainSecondly = mainDiagonal.concat(secondlyDiagonal);
        diagonalsMainSecondly.trim();
        System.out.println("строка с диагоналями= " + diagonalsMainSecondly);

        System.out.println();


        String elementArrayDiagonals = "";
        String [] arrayDiagonals = new String[20];
        int countArrayDiagonals=0;

        for (int i = 0; i < diagonalsMainSecondly.length(); i++) {

            if (diagonalsMainSecondly.charAt(i) != ' '){
                elementArrayDiagonals += diagonalsMainSecondly.charAt(i);
            }
            else {
                arrayDiagonals[countArrayDiagonals] =  elementArrayDiagonals;
                countArrayDiagonals ++;
                elementArrayDiagonals="";
            }
        }

        System.out.println("массив с диагоналями : ");
        for (int i = 0; i < 20; i++) {
            System.out.println(arrayDiagonals[i]+" ");

        }

        System.out.println();
        System.out.println();

        String SB = "";
        int [] arrayNumbers = new int[20];
        int countArrayNumbers=0;

        for (int i = 0; i < 20; i++) {

            if ( arrayDiagonals[i].matches("\\d+\\.\\d+")) {
                double value = Double.parseDouble(arrayDiagonals[i]);
                System.out.println("value double ; "+value);
                if (value >= 1.7) {
                    arrayNumbers[countArrayNumbers] += Math.ceil(value);
                    countArrayNumbers++;
                }
                else{
                    arrayNumbers[countArrayNumbers] += Math.floor(value);
                    countArrayNumbers++;
                }

            } else{

                if ( arrayDiagonals[i].matches("\\D+")){
                    System.out.println("value string ; "+arrayDiagonals[i]);
                    SB += arrayDiagonals[i].substring(1,4) + ',';


                }
            }
        }
        System.out.println();
        System.out.println("SB= "+SB);

        System.out.println();
        System.out.println("массив чисел");

        for (int i = 0; i < arrayNumbers.length; i++) {
            System.out.print(arrayNumbers[i]+"_");

        }



    }

}
