package com.sparta.kd.mocking_exercise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;

public class PlayerRepoTests {
    public PlayerRepo playerRepo = new PlayerRepo();
    Player mockPlayer1 = Mockito.mock(Player.class);
    Player mockPlayer2 = Mockito.mock(Player.class);
    Player mockPlayer3 = Mockito.mock(Player.class);

    @BeforeEach
    public void setUp() {
        playerRepo.createRecord(mockPlayer1);
        playerRepo.createRecord(mockPlayer2);
        playerRepo.createRecord(mockPlayer3);
    }

    @Test
    @DisplayName("Check if players are successfully added")
    public void checkIfPlayersAreAdded() {
        assert(playerRepo.getPlayerCount() == 3);
    }

    @Test
    @DisplayName("Check if get player by name returns the correct player")
    public void checkIfGetPlayerByName() {
        Mockito.when(mockPlayer1.name())
                .thenReturn("Ragnar");
        Mockito.when(mockPlayer2.name())
                .thenReturn("Galahad");
        Mockito.when(mockPlayer3.name())
                .thenReturn("Caspian");
        Assertions.assertEquals(new ArrayList<>(Arrays.asList(mockPlayer1)), playerRepo.getPlayersByName("Ragnar"));
    }

    @Test
    @DisplayName("Check if get all players returns all players")
    public void checkIfGetAllPlayers() {
        Assertions.assertEquals(new ArrayList<>(Arrays.asList(mockPlayer1, mockPlayer2, mockPlayer3)), playerRepo.getAllPlayers());
    }

}
