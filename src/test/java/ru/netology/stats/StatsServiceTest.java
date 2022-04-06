package ru.netology.stats;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void CalcSum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 21, 19, 20, 7, 14, 14, 18};
        int expected = 181;

        int actual = service.calcSum(sales);

        assertEquals(expected, actual);

    }

    @Test
    void CalcAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 21, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.calcAverage(sales);

        assertEquals(expected, actual);
    }


    @Test
    void shouldMinSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.minSales(sales);
        assertEquals(expected, actual);

    }

    @Test
    void shouldPeakSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 21, 19, 20, 7, 14, 14, 18};
        int expected = 6;

        int actual = service.PeakSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldlowAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 21, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.lowAverageSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldAboveAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 21, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.aboveAverageSales(sales);
        assertEquals(expected, actual);
    }
}