package by.academy.java.exs_add.add1;

public class Main {
    public static void main(String[] args){

        Person tom = new Person("Tom");
        System.out.println(tom);
        tom.display();

        Person sam = new Employee("Sam", "OMG");
        System.out.println(sam);
        sam.display();
        Person yur = new Client("YUR", 222,"wqwee");
        yur.display();
        System.out.println(yur);



    }
}
