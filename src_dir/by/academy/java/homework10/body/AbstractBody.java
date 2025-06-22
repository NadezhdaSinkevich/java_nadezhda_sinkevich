package by.academy.java.homework10.body;

public abstract class AbstractBody implements Body{
   private int id;

    public AbstractBody(int id) {
        this.id = id;
    }

    public int getId(){
        return id;
    }

    @Override
    public String toString() {
        return "AbstractBody{" +
                "id=" + id +
                '}';
    }
}
