package by.academy.java.lesson8;

public class Home {
    private AbstractAnimal[] animals;

    public Home(int count) {
        this.animals = new AbstractAnimal[count];
    }


    public boolean add(AbstractAnimal animal){
    animals[0] = animal;
    //+проверка занято ли место, если нет, то добавить
        return true;
    }

    public boolean delete (String name){
        for (int i = 0; i < animals.length; i++) {
            if ((animals[i].getName().equals(name))&&(animals[i]!=null)){
                animals[i]=null;
                return true;
            }
        }
        return false;
    }
}
