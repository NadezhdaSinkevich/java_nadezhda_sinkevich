package by.academy.java.exs_add.add1;

public class Employee extends Person{
    private String company;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Employee(String name, String company){
        super(name);
        this.company = company;
    }

    public void display(){

        System.out.printf("Employee %s works in %s \n", super.getName(), company);
    }
}
