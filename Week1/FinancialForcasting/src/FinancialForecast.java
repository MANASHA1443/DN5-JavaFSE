public class FinancialForecast {

    // Recursive method
    public static double futureValue(double amount, double rate, int years) {

        // Base case
        if (years == 0) {
            return amount;
        }

        // Recursive case
        return futureValue(amount, rate, years - 1) * (1 + rate);
    }

    public static void main(String[] args) {

        double amount = 10000;
        double rate = 0.10;
        int years = 3;

        double result = futureValue(amount, rate, years);

        System.out.println("Future Value = " + result);
    }
}
