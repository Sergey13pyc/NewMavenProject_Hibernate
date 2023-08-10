package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    protected static final String URL = "jdbc:mysql://localhost:3306/mydb";
    protected static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    protected static final String USERNAME = "Sergey Artemov";
    protected static final String PASSWORD = "root";


    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);


        } catch (SQLException | ClassNotFoundException e) {

            throw new RuntimeException(e);
        }
        return connection;

    }



}
