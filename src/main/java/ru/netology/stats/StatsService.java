package ru.netology.stats;

public class StatsService {
    long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    long[] month = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    long average = 15;

    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            // аналог sum = sum + purchase;
            sum += purchase;
        }
        return sum;
    }

    public long calculateAverage(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            // аналог sum = sum + purchase;
            sum += purchase;
        }
        return sum / month.length;

    }

    public long findMonthWhenMaxSales(long[] month) {
        int index = 0; // начинаем с нуля
        for (int i = 1; i < month.length; i++) {
            if (purchases[index] < purchases[i])
                index = i;
            else
                index = index;
            System.out.println("Номер месяца: " + month[index]);
        }
        return month[index];
    }

    public long findMonthWhenMinSales(long[] month) {
        int index = 0; // начинаем с нуля
        for (int i = 1; i < month.length; i++) {
            if (purchases[index] > purchases[i])
                index = i;
            else
                index = index;
            System.out.println("Номер месяца: " + month[index]);
        }
        return month[index];
    }

    public long belowAverage(long[] purchases) {
        long currentMin = purchases[0];
        for (long purchase : purchases) {
            if (currentMin > average) {
                currentMin = purchase;
            }
        } return currentMin;
    }
    public long overAverage(long[] purchases) {
        long currentMin = purchases[0];
        for (long purchase : purchases) {
            if (currentMin < average) {
                currentMin = purchase;
            }
        } return currentMin;
    }
}