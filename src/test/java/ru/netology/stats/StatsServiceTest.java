package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    long[] month = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

    @Test
    void sumSales() {

        StatsService service = new StatsService();
        long expected = 180;
        long actual = service.calculateSum(purchases);
        assertEquals(expected, actual);
    }
    @Test
    void averageSales() {

        StatsService service = new StatsService();
        long expected = 15;
        long actual = service.calculateAverage(purchases);
        assertEquals(expected, actual);
    }
    @Test
    void findMonthWhenMaxSales() {
        StatsService service = new StatsService();
        long expected = 8;
        long actual = service.findMonthWhenMaxSales(month);
        assertEquals(expected, actual);
    }
    @Test
    void findMonthWhenMinSales() {
        StatsService service = new StatsService();
        long expected = 9;
        long actual = service.findMonthWhenMinSales(month);
        assertEquals(expected, actual);
    }
    @Test
    void belowAverage() {
        StatsService service = new StatsService();
        long expected = 5;
        long actual = service.belowAverage(purchases);

        assertEquals(expected, actual);
    }
    @Test
    void overAverage() {
        StatsService service = new StatsService();
        long expected = 5;
        long actual = service.belowAverage(purchases);

        assertEquals(expected, actual);
    }
}