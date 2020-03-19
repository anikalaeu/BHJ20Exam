package by.belhard.j20.exam.manager.services;

import by.belhard.j20.exam.manager.resources.Worker;
import by.belhard.j20.exam.manager.services.DBManager.DBManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class WorkerService {

    private final static String INSERT_SQL = "insert into workers (name, salary) values (?, ?)";

    private DBManager dbManager;

    public WorkerService(final DBManager dbManager) {
        this.dbManager = dbManager;
    }

    public long createWorker(String name, int salary) throws SQLException {
        final PreparedStatement statement = dbManager.prepareStatement( INSERT_SQL, Statement.RETURN_GENERATED_KEYS );
        statement.setString( 1, name );
        statement.setInt( 2, salary );

        int affectedRows = statement.executeUpdate();

        if (affectedRows == 0) {
            throw new SQLException("Creating worker failed, no rows affected.");
        }

        try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
            if (generatedKeys.next()) {
                return generatedKeys.getLong(1);
            } else {
                throw new SQLException("Creating worker failed, no ID obtained.");
            }
        }
    }

}

