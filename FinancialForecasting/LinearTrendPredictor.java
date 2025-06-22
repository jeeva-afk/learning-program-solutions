package FinancialForecasting;
public class LinearTrendPredictor {
    public static double predictNext(int[] data) {
        int n = data.length;
        double sumX = 0, sumY = 0, sumXY = 0, sumXX = 0;

        for (int i = 0; i < n; i++) {
            sumX += i;
            sumY += data[i];
            sumXY += i * data[i];
            sumXX += i * i;
        }

        double slope = (n * sumXY - sumX * sumY) / (n * sumXX - sumX * sumX);
        double intercept = (sumY - slope * sumX) / n;

        return Math.round((slope * n + intercept) * 100.0) / 100.0;
    }
}
