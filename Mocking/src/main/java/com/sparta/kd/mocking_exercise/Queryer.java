package com.sparta.kd.mocking_exercise;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Queryer {

//    private static final Connector connector = Connector.getInstance();
//    private static final Connection connection = connector.getConnection();
//    private static final Statement statement = connector.getStatement();

    public int createRecord(Player player) {
//        try {
//            return statement.executeUpdate("INSERT INTO mocking_test_db.players VALUES (%s, %s, %d, %d, %d, %d, %d)".formatted(player.name(), player.type(), player.strength(), player.speed(), player.intelligence(), player.max_hp(), player.current_hp()));
//        } catch (SQLException e) {
//            e.printStackTrace();
//            return -1;
//        }
        return -1;
    }

    public ArrayList<Player> getPlayersByName(String name) {
//        try {
//            return PlayerPackager.packager(statement.executeQuery("SELECT * FROM mocking_test_db.players WHERE name = " + name));
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
        return null;
    }
}
