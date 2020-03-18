package by.belhard.j20.exam.manager;

import by.belhard.j20.exam.manager.resources.Worker;
import by.belhard.j20.exam.manager.services.BufRdr;
import by.belhard.j20.exam.manager.services.DBManager.DBManager;
import by.belhard.j20.exam.manager.services.WorkerService;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UIMain {


    private static String infoBlock = "Annotation: \n " +
            "1. Add new Project \n " +
            "2. Add Worker on Project \n " +
            "3. Get Workers info \n " +
            "4. Get Projects info \n" +
            "5. Add new Worker to a list \n" +
            "6. Get nearest StartDate \n" +
            "7. Count money \n" +
            "exit";

    public static void main(String[] args) {

        DBManager dbManager = new DBManager();
        BufRdr rdr = new BufRdr();



    }

}
