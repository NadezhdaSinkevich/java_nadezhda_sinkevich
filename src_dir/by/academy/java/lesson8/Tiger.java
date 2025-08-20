package by.academy.java.lesson8;

public class Tiger extends AbstractAnimal{
    public Tiger(String name, String age) {
        super(name, age);
    }

    public Tiger() {
    }

    @Override
    public String makeSound() {
        return "rrrr";
    }

    @Override
    public void sleep() {

    }
}
