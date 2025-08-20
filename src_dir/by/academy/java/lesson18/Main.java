package by.academy.java.lesson18;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.nio.channels.ClosedSelectorException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//public static void main(String[] args) throws IOException,ClassNotFoundException {
/*
        Cat cat = new Cat("viill",1);
       FileOutputStream outputStream = new FileOutputStream("C://Users//nadezhda//Desktop//filesforjava//cat.txt");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        objectOutputStream.writeObject(cat);
        objectOutputStream.close();


        FileInputStream fileInputStream = new FileInputStream("C://Users//nadezhda//Desktop//filesforjava//cat.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Cat object = (Cat) objectInputStream.readObject();
        System.out.println(object);
*/

        //1сравнивать все через equals
        /*
Integer a = 100;
Integer b =100;
Integer c = 200;
Integer e = 200;

System.out.println(a==b);
System.out.println(c==e);

System.out.println(c.equals(e));
*/
   /*
        //2преобразование null в int и Integer
            Integer a=null;
            exec(a);

    */
        /*
        Scanner sc = new Scanner(System.in);
       Integer a= sc.nextInt();
        sc.nextLine();
        String b=  sc.nextLine();
        System.out.println(a+"  " +b);

         */
/*
        BigDecimal b1 = new BigDecimal("1.0");
        BigDecimal b2 = new BigDecimal("1.00");

        System.out.println(b1.equals(b2));
        System.out.println(b1.compareTo(b2));
        */


/*
    //private static void exec (int a)  exeception !
    private static void exec (Integer a){
        System.out.println(a);


 */
/*
        MyClass myClass = new MyClass();
        int number = myClass.getNumber();
        String name = null;
        System.out.println(number+name);
        try {
            Field field = myClass.getClass().getDeclaredField("name");
            field.setAccessible(true);
            field.set(myClass,(String)"new value");
            name = (String) field.get(myClass);

        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        System.out.println(number+name);
        printData(myClass);

    }

    public static void printData(Object myClass){
        try {
            Method method = myClass.getClass().getDeclaredMethod("printData");
            method.setAccessible(true);
            method.invoke(myClass);
        }catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e){
           e.printStackTrace();
        }
    }
}

 */
        /*
MyClass myClass = null;
try {
    Class clazz = Class.forName(MyClass.class.getName());
    Class[] params = {int.class, String.class};
    myClass= (MyClass) clazz.getConstructor(params).newInstance(1,"default2");

} catch (ClassNotFoundException | NoSuchMethodException | RuntimeException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
   e.printStackTrace();
}


System.out.println(myClass);
//reflection.MyClass@60e53b93;

         */

    }}