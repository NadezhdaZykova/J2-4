package ru.netology.stats;

public class StatsService {

    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public long calculateAvg(long[] purchases) {
        long sum = calculateSum(purchases);
        long average = sum / purchases.length;

        return average;
    }

    public long findLastMonthWhenMaxSales(long[] purchases) {
        long max = purchases[0];
        for (long purchase : purchases) {
            if (purchase > max) {
                max = purchase;
            }
        }
        long monthCount = 0;
        long monthMax = 0;
        for (long purchase : purchases) {
            monthCount++;
            if (purchase == max) {
                monthMax = monthCount;
            }
        }
        return monthMax;
    }

    public long findMonthWhenMinSales(long[] purchases) {
        long min = purchases[0];
        for (long purchase : purchases) {
            if (purchase < min) {
                min = purchase;
            }
        }
        long monthCount = 0;
        long monthMin = 0;
        for (long purchase : purchases) {
            monthCount++;
            if (purchase == min) {
                monthMin = monthCount;
            }
        }
        return monthMin;
    }

    public long belowAverageSales(long[] items) {
        long monthCount = 0;
        long avg = calculateAvg(items);
        for (long item : items) {
            if (item > avg) {
                monthCount++;
            }
        }
        return monthCount;
    }

    public long overAverageSales(long[] items) {
        long monthCount = 0;
        long avg = calculateSum(items) / items.length;
        for (long item : items) {
            if (item < avg) {
                monthCount++;
            }
        }  return monthCount;
    }
}