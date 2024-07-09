package com.sparta.kd.mocking_exercise;

import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class Connector {
    private static final Connector connector = new Connector();
    private Connection connection;
    private Statement statement;

        private Connector() {

        Properties properties = new Properties();
        try {
            properties.load(new FileReader("src/main/resources/mysql.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            this.connection = DriverManager.getConnection(
                    properties.getProperty("url"),
                    properties.getProperty("username"),
                    properties.getProperty("password"));
            this.statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connector getInstance() {
        return connector;
    }

    public Connection getConnection() {
        return connection;
    }

    public Statement getStatement() {
        return statement;
    }

}
