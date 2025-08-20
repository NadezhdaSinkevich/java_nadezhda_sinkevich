package by.academy.java.lesson5;

import java.util.Arrays;
import java.util.GregorianCalendar;


public class Main {
    public static void main(String[] args) {




       // int[] array = {5,1,5,2,5,6,7};
       // int[] array1 = {1,2,3,4,5,6,7};
       // boolean equal

       /* Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]+" ");

        }*/
        /*
        int[] array = {5,1,5,2,5,6,7};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]+" ");}

        int i1 = Arrays.binarySearch(array,2);
        System.out.println("i= "+i1);
*/
        /*
        GregorianCalendar myC = new GregorianCalendar();
        System.out.println(myC.get(myC.YEAR)+":"+myC.get(myC.MONTH)+":"+myC.get(myC.DAY_OF_WEEK));
        */


        /*
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]+" ");

        }
        Integer t=9;
        Arrays.fill(array, t);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]+" ");

        }
        */


/*
        //1 способ
        int[] array = {1,2,3,4,5};
        int x = array[1];
        //System.out.println(x);


        // 2 способ
        int[] array2 = new int[]{1,2,3,4,5};

        // 3 способ
        int[] array3 = new int[5];
        array3[3]=3;

        for (int i = 0; i < array3.length; i++) {
            //System.out.println(array3[i]);
        }


        for (int i = 0; i < array3.length; i++) {
            array3[i] = (int)(Math.random()*100);
        }
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]+" ");
        }


        String[] array4 = new String[10];
        array4[1]="qwerty";
        for (int i = 0; i < array4.length; i++) {
            System.out.println(array4[i]+" ");
        }


        int[][] array5 = {{1,2,3},{4,5,6},{7,8,9}};
        int x= array[1];
*/
/*
        int[][] array7 = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i < array7.length; i++) {
            for (int j = 0; j < array7[i].length; j++) {
                System.out.println(array7[i][j]);
            }
            System.out.println();
            }
        }
        */


        //СТРОКИ
        String a = "Hello!!!!";
        String a2 = "Hello!!!!";
        System.out.println(
                //a.charAt(4)
                //a.compareToIgnoreCase(a2) //игнор регистра
                //a.compareTo(a2)
                //a.concat(a2) //  + для строк
                //a.copyValueOf(chars     ) //для массива char
               // a.startsWith("hell") //true
                //a.endsWith("!!") //true
                //a.equals(a2) //сравнивает строки
               // a.equalsIgnoreCase()// без учета регистра
                //a.getBytes()
                //a.hashCode()
                //a.indexOf("o")// первое вхождение символа
               // a.lastIndexOf("o")
               // a.toUpperCase()//все в верхнем регистре
                //a.trim() //обрезает пробелы справа и слева
                //a.substring(3)//с какого индекса/символа начинается вывод
                //a.replace("l","33") // замена символов
        );

        //задача найти запятые в строке и вывести их количество
        String str = "hello, world,!!!!,";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ','){
                count ++;
            }
        }
        System.out.println(count);

        String str1 = "hello, world,!!!!,";
        String str2 = "hello, world,!!!!,";

        System.out.println(str1+str2); //будет три строки

        StringBuilder stringBuilder = new StringBuilder(); //вывод объектом , т.е при соединении мы несоздаем новые строки. будет 2 строки
        stringBuilder
                .append(str1)
                .append(str2);
        //System.out.println(stringBuilder);

        String string = stringBuilder.toString(); // меньше памяти занимает
        System.out.println(string);
        //StringBuffer Для режима многопоточности

    }
}
