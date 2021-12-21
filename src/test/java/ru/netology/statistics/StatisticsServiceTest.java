package ru.netology.statistics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {
    @Test
    void findMax(){
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected,actual);
    }
    @Test
    void findMax1(){
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {86, 87, 88, 12, 12, 12, 12, 12, 12, 12, 12};
        long expected = 88;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected,actual);
    }




}