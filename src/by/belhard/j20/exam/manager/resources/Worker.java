package by.belhard.j20.exam.manager.resources;

public class Worker {

    private static int id;
    private static String name;
    private static int salary;




    public Worker(int id, String name, int salary) {

        this.id = id;
        this.name = name;
        this.salary = salary;

    }


    public static String getName() {
        return name;
    }

    public static int getSalary() {
        return salary;
    }

    public static int getId() {
        return id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
