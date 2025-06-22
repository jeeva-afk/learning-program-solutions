package FinancialForecasting;

import java.util.*;

public class MovingAverage {
    public static List<Double> calculate(int[] data, int k) {
        List<Double> result = new ArrayList<>();
        double sum = 0;

        for (int i = 0; i < data.length; i++) {
            sum += data[i];
            if (i >= k) {
                sum -= data[i - k];
            }
            if (i >= k - 1) {
                result.add(Math.round((sum / k) * 100.0) / 100.0); // rounded to 2 decimal places
            }
        }
        return result;
    }
}

