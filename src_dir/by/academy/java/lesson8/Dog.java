package by.academy.java.lesson8;

public class Dog extends AbstractAnimal{
    public Dog(String name, String age) {
        super(name, age);
    }

    @Override
    public String makeSound() {
        return "gavvv";
    }

    @Override
    public void sleep() {

    }

    public Dog(){

    }
}


