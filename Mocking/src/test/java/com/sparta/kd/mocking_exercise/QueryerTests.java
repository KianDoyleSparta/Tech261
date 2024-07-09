package com.sparta.kd.mocking_exercise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;

import static org.mockito.Mockito.when;

public class QueryerTests {

    private Queryer queryerMock;
    private DAO daoMock;

    @BeforeEach
    public void setUp() {
        queryerMock = Mockito.mock(Queryer.class);
        daoMock = Mockito.mock(DAO.class);
    }

    @Test
    @DisplayName("Check if get by name returns result set with particular name")
    public void checkIfQueryerReturnsName() {
        ArrayList<Player> players = new ArrayList<>(Arrays.asList(new Player("Valdak", "Elf", 10, 20, 15, 50, 45)));
        when(queryerMock.getPlayersByName("Valdak")).thenReturn(players);
        Assertions.assertEquals(players, queryerMock.getPlayersByName("Valdak"));
    }

    @Test
    @DisplayName("Check if DAO returns names")
    public void checkIfDAOReturnsName() {
        ArrayList<Player> players = new ArrayList<>(Arrays.asList(new Player("Valdak", "Elf", 10, 20, 15, 50, 45)));
        when(daoMock.getRecords("Valdak")).thenReturn(players);
        Assertions.assertEquals(players, daoMock.getRecords("Valdak"));
    }

}
