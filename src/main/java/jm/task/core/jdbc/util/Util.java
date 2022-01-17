package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private final String URL = "jdbc:mysql://localhost:3306/mydbtest1";
    private final String USER = "root";
    private final String PASSWORD = "Ehecce1002!";

    public Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connection established!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}
