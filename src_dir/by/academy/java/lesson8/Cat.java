package by.academy.java.lesson8;

public class Cat extends AbstractAnimal {
    public Cat(String name, String age) {
        super(name, age);
    }

    @Override
    public String makeSound() {
        return "mewww";
    }

    @Override
    public void sleep() {

    }

    public Cat(){

    }
}
