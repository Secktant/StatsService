package ru.netology.stats;

public class StatsService {
    public int calcSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public int calcAverage(int[] sales) {
        return calcSum(sales) / sales.length;

    }

    public int PeakSales(int[] sales) {
        int peakMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale > sales[peakMonth]) {
                peakMonth = month;
            }
            month = month + 1;
        }
        return peakMonth + 1;

    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int lowAverageSales(int[] sales) {
        int average = calcAverage(sales);
        int minMonth = 0;
        for (int sale : sales) {
            if (sale < average) {
                minMonth++;

            }

        }
        return minMonth;
    }

    public int aboveAverageSales(int[] sales) {
        int average = calcAverage(sales);
        int minMonth = 0;
        for (int sale : sales) {
            if (sale > average) {
                minMonth++;

            }

        }
        return minMonth;
    }


}

