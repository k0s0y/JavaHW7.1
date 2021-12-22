package ru.netology.statistics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {
    StatisticsService service = new StatisticsService();
    long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};

    @Test
    void findMax(){
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected,actual);
    }
    @Test
    void findMax1(){
        long[] incomesInBillions = {86, 14, 88, 87, 5, 3, 8, 6, 11, 11, 12};
        long expected = 88;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected,actual);
    }




}