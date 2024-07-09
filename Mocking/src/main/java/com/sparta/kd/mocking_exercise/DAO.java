package com.sparta.kd.mocking_exercise;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAO {

    private Queryer queryer = new Queryer();

    public String createRecord(Player player) {
        int i = queryer.createRecord(player);
        if (i > 0) {
            return "Successful entry";
        } else {
            return "Unsuccessful entry";
        }
    }

    public ArrayList<Player> getRecords(String name) {
//        ResultSet resultSet = Queryer.getPlayerByName(name);
//        return PlayerPackager.packager(resultSet);
        return queryer.getPlayersByName(name);
    }
}
