package com.sparta.kd.mocking_exercise;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PlayerPackager {
    public static ArrayList<Player> packager(ResultSet resultSet) {
        ArrayList<Player> playerList = new ArrayList<>();
        try {
            while (resultSet.next()) {

                Player player = new Player(
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getInt(4),
                        resultSet.getInt(5),
                        resultSet.getInt(6),
                        resultSet.getInt(7),
                        resultSet.getInt(8));
                playerList.add(player);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return playerList;
    }
}
