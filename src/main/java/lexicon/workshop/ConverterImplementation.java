package lexicon.workshop;

import java.util.Scanner;

public class ConverterImplementation {

    static Scanner scanner = new Scanner(System.in);

    static void currencyConverter() {
        //Currency Converter – SEK ↔ USD, SEK ↔ EUR
        IO.println("Current conversion rate for SEK ↔ USD, SEK ↔ EUR as of " + DateTimeUtil.dateTimeValue() + " is  ");
        IO.println("1 SEK = 0.0932 EUR");
        IO.println("1 EURO = 0.0932 SEK");
        IO.println("1 USD = 0.0932 SEK");
        IO.println("1 SEK = 0.0932 USD");
        IO.println();
        IO.println("1. SEK to USD");
        IO.println("2. USD to SEK");
        IO.println("3. SEK to EUR");
        IO.println("4. EUR to SEK");
        IO.print("Choose option: ");

        int choice = readInt();
        double result = 0;
        switch (choice) {
            case 1:
                IO.print("Enter SEK amount: ");
                double sekAmount = readDouble();
                inputValidation(sekAmount);
                result = sekAmount * 0.092;
                printResult(sekAmount + " SEK = " + format(result) + " USD");
                break;
            case 2:
                IO.print("Enter USD amount: ");
                double usdAmount = readDouble();
                inputValidation(usdAmount);
                result = usdAmount / 0.092;
                printResult(usdAmount + " USD = " + format(result) + " SEK");
                break;
            case 3:
                IO.print("Enter SEK amount: ");
                double sekValue = readDouble();
                inputValidation(sekValue);
                result = sekValue * 0.085;
                printResult(sekValue + " SEK = " + format(result) + " EUR");
                break;
            case 4:
                IO.print("Enter EURO amount: ");
                double euroValue = readDouble();
                inputValidation(euroValue);
                result = euroValue / 0.085;
                printResult(euroValue + " EUR = " + format(result) + " SEK");
                break;
            default:
                IO.println("Wrong option ..!!! Exiting Currency Conversion");
        }
    }

    static void temperatureConverter() {
        //Temperature Converter – Celsius ↔ Fahrenheit
        IO.println("1. Celsius to Fahrenheit");
        IO.println("2. Fahrenheit to Celsius");
        IO.println("Choose an option: ");

        int choice = readInt();
        double result = 0.0;
        switch (choice) {
            case 1:
                IO.print("Enter Celsius : ");
                double celsius = readDouble();
                result = (celsius * 9 / 5) + 32;
                printResult(celsius + " °C = " + format(result) + " °F");
                break;
            case 2:
                IO.print("Enter Fahrenheit : ");
                double fahrenheit = readDouble();
                result = (fahrenheit - 32) * 5 / 9;
                printResult(fahrenheit + " °F = " + format(result) + " °C");
                break;
            default:
                IO.println("Wrong option choosed!!!!!");
        }
    }

    static void lengthConverter() {
        //Length Converter – Meters ↔ Kilometers
        IO.println("1. Meters to Kilometers");
        IO.println("2. Kilometers to Meters");
        IO.print("Choose option: ");

        int choice = readInt();

        switch (choice) {
            case 1:
                IO.print("Enter Meters : ");
                double meter = readDouble();
                inputValidation(meter);
                printResult(meter + " m = " + format(meter / 1000) + " km");
                break;
            case 2:
                IO.print("Enter Kilometers : ");
                double km = readDouble();
                inputValidation(km);
                printResult(km + " km = " + format(km * 1000) + " m");
                break;
            default:
                IO.println("Wrong option choosed!!!!!");
        }
    }

    static void printResult(String message) {
        IO.println("Result : " + message);
        IO.println("Converted on : " + DateTimeUtil.dateTimeValue());
    }

    static String format(double value) {
        return String.format("%.2f", value);
    }

    static int readInt() {
        while (!scanner.hasNextInt()) {
            IO.println("Please enter correct value to proceed");
            scanner.next();
        }
        return scanner.nextInt();
    }

    static double readDouble() {
        while (!scanner.hasNextDouble()) {
            IO.println("Please enter correct value to proceed");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    static void inputValidation(double amount){
        if (amount < 0) {
            IO.println("Negative values cannot be processed !!!");
            return;
        }
    }
}