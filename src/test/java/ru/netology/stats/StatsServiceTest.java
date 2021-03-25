package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatsService service = new StatsService();

    @Test
    void sumSales() {
        long expected = 180;
        long actual = service.calculateSum(purchases);
        assertEquals(expected, actual);
    }
    @Test
    void averageSales() {
        long expected = 15;
        long actual = service.calculateAvg(purchases);
        assertEquals(expected, actual);
    }
    @Test
    void findMonthWhenMaxSales() {
        long expected = 8;
        long actual = service.findLastMonthWhenMaxSales(purchases);
        assertEquals(expected, actual);
    }
    @Test
    void findMonthWhenMinSales() {
        long expected = 9;
        long actual = service.findMonthWhenMinSales(purchases);
        assertEquals(expected, actual);
    }
    @Test
    void belowAverage() {
        long expected = 5;
        long actual = service.belowAverageSales(purchases);

        assertEquals(expected, actual);
    }
    @Test
    void overAverage() {
        long expected = 5;
        long actual = service.overAverageSales(purchases);
        assertEquals(expected, actual);
    }
}