package by.academy.java.lesson7;

public class Main {
    public static void main(String[] args) {
        /*
        //создать одномерный массив . заполнить произвольн числами и вывести сумму всех чисел, размер 10, числа от 1 до 10
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = (int) (Math.random()*10 +1);
            System.out.print(array[i]+" ");
        }
        System.out.println();
        int result =0;
        for (int j : array){
            result += j;
        }
        System.out.println(result);

         */

        //создать одномерн массив, размер 15, из случайных от 0 до 100, вывести мин и макс
        /*
        int[] array = new int[15];
        for (int i = 0; i < 15; i++) {
            array[i] = (int) (Math.random()*100 +1);
            System.out.print(array[i]+" ");
        }
        int elementMin, elementMax;

        elementMin = array[0];
        elementMax = array[0];

        for (int i = 0; i < 15; i++) {

            if (elementMin>array[i])
            {elementMin = array[i];}

            if (elementMax < array[i])
            {elementMax = array[i];}

        }
        System.out.println();
        System.out.println(elementMin);
        System.out.println(elementMax);
      */
/*
        // одномерный массив размер 20. посчитать чет и нечет
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = (int) (Math.random()*100 +1);
            System.out.print(array[i]+" ");
        }
        int countChet = 0;
        int cointNeChet = 0;
        System.out.println();
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0){
                countChet++;
            }
            else
            {
                cointNeChet++;
            }

        }
        System.out.println();
        System.out.println("чет = " +  countChet + " нечет = " +  cointNeChet);
*/

        /*
        // создать массив и его обратный

        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = (int) (Math.random()*100 +1);
            System.out.print(array[i]+" ");
        }
        int j=9;

        int[] arraySecond = new int[10];
        for (int i = 0; i < 10; i++) {

            arraySecond[i] = array[j];
            j--;
        }

        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(arraySecond[i]+" ");

        }

         */

/*
        //массив старт, ввести 2 числа. первое - начало промежутка, 2 конец промежутка. создать массив ?
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = (int) (Math.random()*100 +1);
            System.out.print(array[i]+" ");
        }

        int indexStart = 2;
        int indexEnd = 9;

        int lengthArraySecond = indexEnd - indexStart +1;
        int[] arraySecond = new int[lengthArraySecond];

        for (int i = 0; i < lengthArraySecond; i++) {
            arraySecond[i] = array[indexStart];
            indexStart++;
        }

        System.out.println();

        for (int i = 0; i < lengthArraySecond; i++) {

            System.out.print( arraySecond[i] + " ");
        }

*/

/*
        //рандом массив, сумма элементов, среднеарифм, не больше2 знаков
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = (int) (Math.random()*100 +1);
            System.out.print(array[i]+" ");
        }

        double sum=0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println();
        System.out.println("sum = "+sum);

        double a = sum/ array.length;
        System.out.printf("ср = %.2f%n",a);
*/
/*
        // 7 элементов. создать массив (1-10), сдвинуть элементы на один шаг
        int[] array = new int[7];
        for (int i = 0; i < 7; i++) {
            array[i] = (int) (Math.random() * 10 + 1);
            System.out.print(array[i] + " ");
        }


        int lastElement = array[6];

        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = lastElement;

        System.out.println();

        for (int i = 0; i < 7; i++) {
            System.out.print(array[i] + " ");
        }
*/
         //взять строку , проверить пустая/не пустая/состоит из пробелов
/*
        String str = "fff";

        if(str.isEmpty()) {
            System.out.println("пустая");
        }
        else {

            String str1 = str.trim();
            if (str1.isEmpty())
            {
                System.out.println("из пробелов");
            }
            else {
                System.out.println("не пустая");
            }

        }
*/
/*
        //полиндром или нет
        String str = "kabak";

        boolean polidrom = true;
        int i=0;
        int j=str.length()-1;


do{
            System.out.println(str.charAt(i)+" "+str.charAt(j));
            System.out.println("i= "+i+" j="+j+" "+polidrom);
            if (str.charAt(i) == str.charAt(j)) {
                i++;
                j--;

            } else {
                polidrom = false;
                //break;
            }
}while ( i<=j && polidrom == true);

        System.out.println(polidrom);
*/



        // +-*/

        /*
        String str = "5+8";
        int indexOperation = 0;
        char symbol ;
        String strNumberFirst ="";
        int numberFirst ;


        for (int i = 0; i < str.length(); i++) {



        symbol = str.charAt(i);

        switch (symbol) {
            case + : {
                indexOperation = str.indexOf(symbol);

            }
            case "-": {

            }
            case "*" {

            }
            case "/" {

            }
            default:{
                strNumberFirst += str.charAt(i);

            }

            numberFirst = Integer.parseInt(strNumberFirst);
        }


        }

*/


    }

}
