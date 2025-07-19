package finance;

public class Forecast {
    public static double forecast(double value, double growthRate, int years) {
        if (years == 0) return value;
        return forecast(value * (1 + growthRate), growthRate, years - 1);
    }

    public static double optimizedForecast(double value, double rate, int years) {
        return value * Math.pow(1 + rate, years);
    }

    public static void main(String[] args) {
        System.out.println("Recursive Forecast: " + forecast(10000, 0.1, 5));
        System.out.println("Optimized Forecast: " + optimizedForecast(10000, 0.1, 5));
    }
}