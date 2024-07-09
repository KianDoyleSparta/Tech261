package com.sparta.kd.mocking_exercise;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class PlayerRepo {
    public static ArrayList<Player> players = new ArrayList<Player>();

    public void createRecord(Player player) {
        players.add(player);
    }

    public ArrayList<Player> getAllPlayers() {
        return players;
    }

    public ArrayList<Player> getPlayersByName(String name) {
        return players.stream().filter(player -> player.name().equals(name)).collect(Collectors.toCollection(ArrayList::new));
    }

    public int getPlayerCount() {
        return players.size();
    }


}
