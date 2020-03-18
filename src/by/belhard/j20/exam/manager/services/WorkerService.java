package by.belhard.j20.exam.manager.services;

import by.belhard.j20.exam.manager.resources.Worker;
import by.belhard.j20.exam.manager.services.DBManager.DBManager;

public class WorkerService{


    private DBManager dbManager;
    private static BufRdr rdr;


    public WorkerService () {

        Worker worker = new Worker( Worker.getId(  ), Worker.getName(), Worker.getSalary() );

    }
    public void WorkerToBase () {



    }

    private WorkerService(DBManager dbManager) {
        this.dbManager = dbManager;
        rdr = new BufRdr();
    }





    //public void createWorker (){
      //  dbManager.prepareStatement("insert ...")

    //}

   /* public void getUser(){
        try {
           ResultSet resultSet= connection.createStatement().executeQuery( "" );
            resultSet.getBlob( 0 );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }*/
}
