package by.academy.java.lesson4;

import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main (String[] args)
    {
        //1
        /*
        int a=10;
        //1
        while (a>0){
            a--;
            System.out.println("ihaa"+a);
        }
        //2
        a=10;
        do{
            a--;
            System.out.println("ihaa"+a);

        }while (a<0);
*/
//3
        /*
        String s = "aaa";
        int count = 0;
        String res="";
        for (int i = 0; i < s.length(); i++) {
            //res +=    s.charAt(i) + i;  не работает
            //Integer.toString(i)
         res +=    s.charAt(i) ;
         res += i;
         count++;
        }
        System.out.println("count= " + count);
        System.out.println("res= " + res);
        */


        //4
        /*
        String s = "aaa";
        int count = 0;

        String res="";
        String res2="";

        for (int i = 0,y=10; i < s.length() && y>0; i++,y--) {

            res +=    s.charAt(i) + Integer.toString(i);
            res2 +=   s.charAt(i) + Integer.toString(y);
            count++;
            System.out.println("count= " + count);
        }
        System.out.println("count= " + count);
        System.out.println("res= " + res);
        System.out.println("res2= " + res2);
        */

        //5
        /*
        int[] array = {1,2,3,4,5};
                for (int ar : array){
                    System.out.println("ar = " + ar);
                }

        Iterator iterator = Arrays.stream(array).iterator();

                while (iterator.hasNext()){
                    System.out.println("arr=" + iterator.next()); // тоже самое что и код 5
                }
                */

        //6 табл умножения
        /*
        for (int i = 1; i <= 10 ; i ++){
            for (int j = 1; j <= 10; j++)
            {
                System.out.print(i*j+" ");
            }
        System.out.println();
    }
    */
        /*
        if (i == 3 ) {
            break;
            //continue;
            //return
        }
        System.out.println("hahahh");
        */


    }

}
