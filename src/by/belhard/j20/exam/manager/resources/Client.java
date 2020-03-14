package by.belhard.j20.exam.manager.resources;

public class Client {
    private int cId;
    private String name;
    private boolean active = false;

    public Client(int cId, String name, boolean active) {
        this.cId = cId;
        this.name = name;
        this.active = active;
    }


//    boolean payment = false;
    // Сопоставление клиента и объекта делать в SQL
}