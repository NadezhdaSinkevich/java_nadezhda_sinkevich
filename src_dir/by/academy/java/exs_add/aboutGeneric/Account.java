package by.academy.java.exs_add.aboutGeneric;

public class Account<T,S> {
    public T id;
    public S sum;

    public Account(T id, S sum) {
        this.id = id;
        this.sum = sum;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public S getSum() {
        return sum;
    }

    public void setSum(S sum) {
        this.sum = sum;
    }
}
