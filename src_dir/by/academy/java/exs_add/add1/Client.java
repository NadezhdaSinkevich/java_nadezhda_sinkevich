package by.academy.java.exs_add.add1;

public class Client extends Person{
    private int sum;
private String bank;

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }


    public Client(String name, int sum, String bank) {
        super(name);
        this.sum = sum;
        this.bank = bank;
    }

    public void display(){

        System.out.printf("Client %s has account in %s \n", super.getName(), bank);
    }
}
