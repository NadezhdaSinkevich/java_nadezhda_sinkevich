package by.academy.java.exs_add.aboutGeneric;

public class Main {
    public static void main (String[] args){
        Account<String,Integer> acc1 = new Account<String,Integer>("2345", 5000);
        String acc1Id = acc1.getId();
        Integer accSum1  = acc1.getSum();

        System.out.println(acc1Id+" "+accSum1);


        Printer printer = new Printer();
        String[] people = {"Tom", "Alice", "Sam", "Kate", "Bob", "Helen"};
        Integer[] numbers = {23, 4, 5, 2, 13, 456, 4};
        printer.<String>print(people);
        printer.<Integer>print(numbers);
    }
}
