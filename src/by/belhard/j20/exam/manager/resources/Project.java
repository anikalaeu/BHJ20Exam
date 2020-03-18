package by.belhard.j20.exam.manager.resources;

import java.util.Date;

public class Project {
    private static int id;
    private static String projectName;
    private static int worker_id;
    private static int cost;
    private static int necessary_time_days;
    private static Date start_date;
    private static Date finish_date;


    public Project(int id, String projectName, int worker_id, int cost,
                   int necessary_time_days, Date start_date, Date finish_date) {
        this.id = id;
        this.projectName = projectName;
        this.worker_id = worker_id;
        this.cost = cost;
        this.necessary_time_days = necessary_time_days;
        this.start_date = start_date;
        this.finish_date = finish_date;
    }

    /*public Project() {

    }*/

    public void setWorker_id(int worker_id) {
        this.worker_id = worker_id;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setNecessary_time_days(int necessary_time_days) {
        this.necessary_time_days = necessary_time_days;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public void setFinish_date(Date finish_date) {
        this.finish_date = finish_date;
    }

    public static int getId() {
        return id;
    }

    public static String getProjectName() {
        return projectName;
    }

    public static int getWorker_id() {
        return worker_id;
    }

    public static int getCost() {
        return cost;
    }

    public static int getNecessary_time_days() {
        return necessary_time_days;
    }

    public static Date getStart_date() {
        return start_date;
    }

    public static Date getFinish_date() {
        return finish_date;
    }
}


