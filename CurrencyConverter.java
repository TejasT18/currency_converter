import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Currency Converter");
        System.out.println("Available currencies: USD, EUR, AUD, INR, BRL, RUB");

        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble();

        System.out.print("Enter the currency to convert from (USD/EUR/AUD/INR/BRL/RUB): ");
        String fromCurrency = scanner.next().toUpperCase();

        System.out.print("Enter the currency to convert to (USD/EUR/AUD/INR/BRL/RUB): ");
        String toCurrency = scanner.next().toUpperCase();

        double result = convertCurrency(fromCurrency, toCurrency, amount);
        if (result != -1) {
            System.out.printf("%.2f %s = %.2f %s\n", amount, fromCurrency, result, toCurrency);
        } else {
            System.out.println("Conversion not supported for the given currencies.");
        }

        scanner.close();
    }

    public static double convertCurrency(String fromCurrency, String toCurrency, double amount) {
        switch (fromCurrency) {
            case "USD":
                return convertFromUSD(toCurrency, amount);
            case "EUR":
                return convertFromEUR(toCurrency, amount);
            case "AUD":
                return convertFromAUD(toCurrency, amount);
            case "INR":
                return convertFromINR(toCurrency, amount);
            case "BRL":
                return convertFromBRL(toCurrency, amount);
            case "RUB":
                return convertFromRUB(toCurrency, amount);
            default:
                return -1;
        }
    }

    public static double convertFromUSD(String toCurrency, double amount) {
        switch (toCurrency) {
            case "USD":
                return amount;
            case "EUR":
                return amount * 0.83;
            case "AUD":
                return amount * 1.29;
            case "INR":
                return amount * 74.21;
            case "BRL":
                return amount * 5.33;
            case "RUB":
                return amount * 75.11;
            default:
                return -1;
        }
    }

    public static double convertFromEUR(String toCurrency, double amount) {
        // Implement similar switch cases for conversion from EUR
        switch (toCurrency) {
            case "USD":
                return amount * 1.21;
            case "EUR":
                return amount;
            case "AUD":
                return amount * 1.55;
            case "INR":
                return amount * 88.95;
            case "BRL":
                return amount * 6.37;
            case "RUB":
                return amount * 89.53;
            default:
                return -1;
        }
    }

    public static double convertFromAUD(String toCurrency, double amount) {
        // Implement similar switch cases for conversion from AUD
        switch (toCurrency) {
            case "USD":
                return amount * 0.78;
            case "EUR":
                return amount * 0.65;
            case "AUD":
                return amount;
            case "INR":
                return amount * 57.21;
            case "BRL":
                return amount * 4.11;
            case "RUB":
                return amount * 57.89;
            default:
                return -1;
        }
    }

    public static double convertFromINR(String toCurrency, double amount) {
        // Implement similar switch cases for conversion from INR
        switch (toCurrency) {
            case "USD":
                return amount * 0.013;
            case "EUR":
                return amount * 0.011;
            case "AUD":
                return amount * 0.017;
            case "INR":
                return amount;
            case "BRL":
                return amount * 0.072;
            case "RUB":
                return amount * 0.013;
            default:
                return -1;
        }
    }

    public static double convertFromBRL(String toCurrency, double amount) {
        // Implement similar switch cases for conversion from BRL
        switch (toCurrency) {
            case "USD":
                return amount * 0.19;
            case "EUR":
                return amount * 0.16;
            case "AUD":
                return amount * 0.24;
            case "INR":
                return amount * 13.92;
            case "BRL":
                return amount;
            case "RUB":
                return amount * 14.07;
            default:
                return -1;
        }
    }

    public static double convertFromRUB(String toCurrency, double amount) {
        // Implement similar switch cases for conversion from RUB
        switch (toCurrency) {
            case "USD":
                return amount * 0.013;
            case "EUR":
                return amount * 0.011;
            case "AUD":
                return amount * 0.017;
            case "INR":
                return amount * 77.36;
            case "BRL":
                return amount * 0.071;
            case "RUB":
                return amount;
            default:
                return -1;
        }
    }
}
