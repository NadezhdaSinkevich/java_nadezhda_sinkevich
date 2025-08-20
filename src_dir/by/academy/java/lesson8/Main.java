package by.academy.java.lesson8;

public class Main {
    public static void main (String[] args){

        Car car = new Car();

        Car car1 = new Car("BMB",2000,Color.YELLOW);

       // Car car3 = car;// не создан объект,а будет ссылка

        System.out.println(car1);
        Car car3 = new Car("WW",2020,"red");

        System.out.println(car1);

        System.out.println(car3);


        int sum = Calculator.sum(1,2);
        System.out.println(sum);

        /*
            //Dog dog = new Dog("qwerty","12");
            AbstractAnimal dog = new Dog("qwerty", "12");
            System.out.println(dog.makeSound());
            System.out.println(dog);


            //Cat cat = new Cat("mew","1");
            AbstractAnimal cat = new Cat("mew", "1");
            System.out.println(cat.makeSound());
            System.out.println(cat);


            AbstractAnimal tiger = new Tiger("tiger", "5");
            System.out.println(tiger.makeSound());
            System.out.println(tiger);

        */



        //AbstractAnimal animal = new Dog("qwerty", "12");
        extracted (new Dog("qwerty", "12"));
    }



        private static void extracted (AbstractAnimal animal){
            System.out.println(animal.makeSound());
            System.out.println(animal);
        }



}
