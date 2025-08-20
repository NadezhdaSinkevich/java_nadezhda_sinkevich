package by.academy.java.lesson11;

import java.util.*;

public class Main {
    public static void main (String[] args ){
/*
        //методы интерфейса collection
        List <String> list = new ArrayList<>();

        list.add("Rome");
        list.add("Minsk");
        list.add("NY");

        System.out.println(list);

        List <String> list2 = new ArrayList<>(list);

        list2.add("Gomel");
        list2.add("Boston");
        list2.add("Warshava");

        System.out.println(list2);


        list.clear();
        System.out.println(list);

       if(list.isEmpty()) {
           System.out.println("empty");
       }
       else {
           System.out.println("not empty");
       }

       Iterator<String> iterator = list2.iterator();

       while (iterator.hasNext()){
           System.out.println(iterator.next());
       }

       list2.remove(0);
       System.out.println(list2);

       list2.removeAll(List.of("Gomel","Minsk"));
       System.out.println(list2);

       System.out.println(list2.size());
       //list.toarray

        //методы интерфейса list

        list2.add(1,"Grodno");
        System.out.println(list2);

        list2.addAll(1,List.of("Grodno","Brest"));
        System.out.println(list2);

        System.out.println(list2.get(3));
        System.out.println(list2.indexOf("Grodno"));

        //ListIterator

       List<String> listof = List.of("12","21");
       //listof.add("11"); будет ошибка
       // listof.remove(1); // будет ошибка, т.к лист неизменный
*/

        /*
        List <String> list = new ArrayList<>();
        list.add("Rome");
        list.add("Minsk");
        list.add("NY");

        List <String> list1 = new ArrayList<>();
        list1.add("Brest");
        list1.add("Kemer");
        list1.add("London");

        System.out.println(list);
        System.out.println(list1);

    List<String> sublist = list1.subList(0,1);
    System.out.println(sublist);

     //set

       list.sort(Comparator.naturalOrder());

        System.out.println(list);
        System.out.println(list1);
*/

        List<Car> list = new ArrayList<>();

        list.add(new Car("wb",20111,"green"));
        list.add(new Car("vv",2011,"blue"));

        System.out.println(list);
        list.sort(Comparator.naturalOrder());
        System.out.println(list);

        list.sort(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getModel().compareTo(o2.getModel());
            }
        });

/*
        list.sort(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                if (year > o.year){
                    return 1;
                }
                if (year < o.year){
                    return -1;
                }
                return 0;
            }
        });
*/

       // list.sort;


        //LinkedList
    }

    List <String> list = new ArrayList<>();
}
