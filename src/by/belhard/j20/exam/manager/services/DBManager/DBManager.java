package by.belhard.j20.exam.manager.services.DBManager;

import by.belhard.j20.exam.manager.resources.Project;
import by.belhard.j20.exam.manager.resources.Worker;

import java.sql.*;
import java.util.*;
import java.util.Date;

public class DBManager {

    private static final String DATABASE_URL =
            "jdbc:mysql://127.0.0.1:3306/BHJ20?serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "root";

    public static String addWorker = "insert into workers () value (?, ?, ?);";
    public static String addProject = "insert into projects value (?, ?, ?, ?, ?, ?, ?);";
    public static String addWorkerOnProject = "update projects set worker_id = ? where project_name = ?;";
    public static String getProjectsInfo = "select * from projects p join workers w on (p.worker_id = w.id)";
    public static String getWorkersInfo = "select * from workers;";
    public static String getProjectDate = "select start_date from projects where project_name like ?;";
    public static String getCost = "select cost from projects";



    public Connection connection;

    Worker worker;

    public DBManager ()

    {

        {

            try {
                connection = DriverManager.getConnection( DATABASE_URL, USER, PASS );

                final PreparedStatement addworker = connection.prepareStatement( addWorker );
                addworker.setInt( 0, Worker.getId() );
                addworker.setString( 1, Worker.getName() );
                addworker.setInt( 2, Worker.getSalary() );
                addworker.executeQuery();

                final PreparedStatement addProj = connection.prepareStatement( addProject );
                addProj.setInt( 0, Project.getId() );
                addProj.setString( 1, Project.getProjectName() );
                addProj.setInt( 2, Project.getWorker_id() );
                addProj.setInt( 3, Project.getCost() );
                addProj.setInt( 4, Project.getNecessary_time_days() );
                addProj.setDate( 5, (java.sql.Date) Project.getStart_date() );
                addProj.setDate( 6, (java.sql.Date) Project.getFinish_date() );
                addProj.executeQuery();


                final PreparedStatement addWorkeronProj = connection.prepareStatement( addWorkerOnProject );
                addWorkeronProj.setInt( 0, Worker.getId() );
                addWorkeronProj.setString( 1, Project.getProjectName() );
                addWorkeronProj.executeQuery();

                final PreparedStatement getProjInf = connection.prepareStatement( getProjectsInfo );
                getProjInf.getResultSet();
                getProjInf.executeQuery();

                final PreparedStatement getWorkerInf = connection.prepareStatement( getWorkersInfo );
                getWorkerInf.getResultSet();
                getWorkerInf.executeQuery();

                final PreparedStatement projDate = connection.prepareStatement( getProjectDate );
                projDate.setDate( 0, (java.sql.Date) Project.getStart_date() );
                projDate.executeQuery();

                final PreparedStatement getProjCost = connection.prepareStatement( getCost );
                getProjCost.getResultSet();
                getProjCost.executeQuery();


            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /*@Override
    public String toString() {
        return "DBManager{" +
                "connection=" + connection +
                ", worker=" + worker +
                '}';
    }*/



    /*public void prepareStatement(Integer integer) {

        connection.prepareStatement()
    }*/



    /*public List<Worker> getWorkerListByCharInclude(char c) throws SQLException {

        PreparedStatement preparedStatement = connection.prepareStatement(query4);

        preparedStatement.setString(1, "%" + c + "%");

        ResultSet resultSet = preparedStatement.executeQuery();

        List<Worker> WorkerList = new ArrayList<>();

        //Set<Specialty> specialties = new HashSet<>();

        while (resultSet.next()) {

            int idWorker = resultSet.getInt(1);
            String name = resultSet.getString(2);
            int salary = resultSet.getInt(3);
            int idSpec = resultSet.getInt(6);
            String specialtyTitle = resultSet.getString("specialty");

            Specialty specialty = new Specialty(idSpec, specialtyTitle);
            specialties.add(specialty);

            Employee employee = new Employee(idEmpl, name, date, salary,
                    specialties.stream().filter(
                            s -> s.equals(specialty)).findFirst().orElseThrow(RuntimeException::new
                    )
            );

            employeeList.add(employee);
        }

        return employeeList;
    }

    public void initDBConnection() throws SQLException {

//    Connection connection = DriverManager.getConnection(DATABASE_URL, USER, PASS);

    *//*Statement statement = connection.createStatement();
    int executeResult = statement.executeUpdate(query2);
    System.out.println(executeResult);*//*

        PreparedStatement preparedStatement = connection.prepareStatement(query3);
        preparedStatement.setInt(1, 1);
        preparedStatement.setInt(2, 3);

        ResultSet resultSet = preparedStatement.executeQuery();
        List<Specialty> specialties = new ArrayList<>();

        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String specialty = resultSet.getString("s");

            specialties.add(new Specialty(id, specialty));
        }

        System.out.println(specialties);

    }*/
}
