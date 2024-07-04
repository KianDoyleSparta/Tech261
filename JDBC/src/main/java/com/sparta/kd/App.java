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
            ResultSet resultSet = statement.executeQuery("SELECT * FROM northwind.customers");
            while(resultSet.next()) {
                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }



    }
}
