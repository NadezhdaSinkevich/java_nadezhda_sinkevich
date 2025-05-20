package by.academy.java.lesson2;

public class Main {
     static String strOut;
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Bill");
        cat.setAge(5);

        System.out.println(cat.getName()+cat.getAge());
        System.out.println(cat);


        String name = cat.getName();
        int age = cat.getAge();
        short rt = (short) age;
        System.out.println(rt);

/*
        byte a = -120; //  -128 до 127
        short b = 456;
        long l = 121121121L;  // L
        float f= 2F;
       //int i = Integer.parseInt(s: "123");
       // System.out.println(i);
        double d = 12.1;
        char c = 1067; // out Ы
        //char s = 'Ы';
        boolean bo = false;

        String myString = "my string";
        String myString1 = "123";

        Byte a1 = -120;
        Short b1 = 16129;
        Long l1 = 121121121L;
        Float f1= 2F;
        Integer i1 = 1;
        Double d1 = 12.1;
        Character c1 = 1067;
        Boolean bo1 = false;

        byte newA = (byte) i;
        System.out.println(newA);

        //в int нет методов, integer есть методы для преобразования (parseInt)
        //System.out.println(bo);

        strOut ="eee";
*/
    }

}
