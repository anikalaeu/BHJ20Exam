package by.belhard.j20.exam.manager.resources;

public class Worker {

    private String name;


    private int salary;
    //link to obj

    public Worker(String name, int salary) {
        this.name = name;

        this.salary = salary;
    }


    public String getName() {
        return name;
    }


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
