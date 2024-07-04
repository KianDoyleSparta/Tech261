package com.sparta.kd;

import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class App {

    public static Connector connector = Connector.getConnector();
    public static Connection connection = connector.getConnection();
    public static Statement statement = connector.getStatement();

    public static void main(String[] args) {

        try {
            ResultSet resulSet = statement.executeQuery("SELECT * FROM northwind.customers");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
