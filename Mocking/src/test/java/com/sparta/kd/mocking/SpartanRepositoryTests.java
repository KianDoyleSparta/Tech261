package com.sparta.kd.mocking;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;


public class SpartanRepositoryTests {
    SpartanRepository subjectUnderTest = new SpartanRepository();
    Spartan mockSpartan1 = Mockito.mock(Spartan.class);
    Spartan mockSpartan2 = Mockito.mock(Spartan.class);

    @BeforeEach
    public void setUp() {
        subjectUnderTest.addSpartan(mockSpartan1);
        subjectUnderTest.addSpartan(mockSpartan2);
    }

    @Test
    @DisplayName("Add Spartans")
    public void testAddSpartan() {
        assert(subjectUnderTest.getNumSpartans() == 2);
    }

    @Test
    @DisplayName("Testing find spartan")
    public void testFindSpartan() {
        Mockito.when(mockSpartan2.getId())
                .thenReturn(27);
        Assertions.assertEquals(mockSpartan2, subjectUnderTest.findSpartan(27));
    }

    @Test
    @DisplayName("Test created within 24 hours")
    public void testSpartanCreatedWithin24Hours() {
        Mockito.when(mockSpartan1.getStartDate())
                .thenReturn(java.time.LocalDate.now());
        Mockito.when(mockSpartan2.getStartDate())
                .thenReturn(java.time.LocalDate.now().minusDays(2));
        assert(subjectUnderTest.getSpartansCreatedLast24Hours().size() == 1);
    }

    @Test
    @DisplayName("Test change name where name is null")
    public void testingChangeNameNull() {
        Mockito.when(mockSpartan1.getId())
                .thenReturn(3);
        Mockito.doThrow(IllegalArgumentException.class)
                .when(mockSpartan1)
                .setName(null);
        assert(!subjectUnderTest.changeName(3, null));
    }

    @Test
    @DisplayName("Check ID is called once per spartan")
    public void checkIDCalledOncePerSpartan() {
        subjectUnderTest.findSpartan(20);
        Mockito.verify(mockSpartan1, Mockito.times(1)).getId();
        Mockito.verify(mockSpartan2, Mockito.times(1)).getId();
    }

    @Test
    @DisplayName("check methods are called in order")
    public void checkOrderGetAllSpartans() {
        subjectUnderTest.getAllSpartans();
        InOrder inOrder = Mockito.inOrder(mockSpartan1);
        inOrder.verify(mockSpartan1).getId();
        inOrder.verify(mockSpartan1).getName();
        inOrder.verifyNoMoreInteractions();
    }

    @Test
    @DisplayName("test correct parameter")
    public void testCorrectParameter() {
        Mockito.when(mockSpartan1.getId())
                .thenReturn(3);
        subjectUnderTest.changeName(3, "Babish");
        Mockito.verify(mockSpartan1).setName("Babish");
    }

}
