package by.academy.java.homework10.head;

public abstract class AbstractHead implements Head {
    private int id;

    public AbstractHead(int id) {
        this.id = id;
    }

    public int getId(){
        return id;
    }

    @Override
    public String toString() {
        return "AbstractHead{" +
                "id=" + id +
                '}';
    }
}
