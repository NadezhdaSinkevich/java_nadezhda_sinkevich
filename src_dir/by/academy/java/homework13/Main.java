package by.academy.java.homework13;


import java.util.SequencedSet;

public class Main {
    public static void main(String[] args){

      MyArrayList array =  new MyArrayList();
      System.out.println("array= " + array);


        array.MyAdd("qwer");
        String b="qwe12";
        int a=123;

        array.MyAdd(a);
        array.MyAdd(b);
        array.MyAdd(a);
        array.MyAdd(a,11);

        System.out.println(array);
        System.out.println(array.MyIsEmpty());
        System.out.println("size=" + array.MySize());

        //array.MyRemove(a);
        //array.MyRemove(0);
        //System.out.println(array);

        array.MySet(3,"qww");
        System.out.println(array);

        System.out.println("get = "+array.MyGet(0));

        System.out.println("first index="+array.MyIndexOf(a));
        System.out.println("last index="+array.MyLastIndexOf(a));
        System.out.println("contain ind =  "+array.MyContains(b));







    }

}
