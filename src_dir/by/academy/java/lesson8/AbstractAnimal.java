package by.academy.java.lesson8;

public abstract class AbstractAnimal implements Animal{
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public AbstractAnimal(String name, String age) {
        this.name = name;
        this.age = age;
    }
    public AbstractAnimal(){

    }
    /*
    public String makeSound(){
        return "make sound";
    }
    */

    /*
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
    */

}
