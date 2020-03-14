package by.belhard.j20.exam.manager.resources;

public class Obj {
    private int id;
    private String objName;
    private int cost;
//    private String client;

    public Obj(int id, String objName, int cost/*, String client*/) {
        this.id = id;
        this.objName = objName;
        this.cost = cost;
//        this.client = client;
    }

    public int getId() {
        return id;
    }

    public String getObjName() {
        return objName;
    }


    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

 /*   public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }*/
}
