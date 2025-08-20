package by.academy.java.lesson8;

public enum Factory
{
    CAT(new Cat());

    private Animal animal;
    Factory(Animal animal){
        this.animal = animal;
    }

    public Animal getAnimal(){
        return animal;
    }
}
