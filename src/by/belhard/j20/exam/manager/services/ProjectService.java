package by.belhard.j20.exam.manager.services;

import by.belhard.j20.exam.manager.resources.Project;
import by.belhard.j20.exam.manager.services.DBManager.DBManager;

public class ProjectService {



    private DBManager dbManager;
    private static BufRdr rdr;
    //BufRdr rdr = new BufRdr ();



    public ProjectService () {
        Project project = new Project( Project.getWorker_id(), Project.getProjectName(), Project.getWorker_id(),
                Project.getCost(),Project.getNecessary_time_days(), Project.getStart_date(), Project.getFinish_date());




    }

    public ProjectService(DBManager dbManager) {
        this.dbManager = dbManager;
        rdr = new BufRdr();
    }





}
