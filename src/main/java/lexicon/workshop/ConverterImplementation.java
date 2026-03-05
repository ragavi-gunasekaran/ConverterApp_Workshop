package lexicon.workshop;

import java.util.Scanner;

public class ConverterImplementation {

    static Scanner scanner = new Scanner(System.in);
    static boolean value = true;


    static void currencyConverter() {
        //Currency Converter – SEK ↔ USD, SEK ↔ EUR
        IO.println("Current conversion rate for SEK ↔ USD, SEK ↔ EUR as of " + DateTimeUtil.dateTimeValue() + " is ");
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
        IO.print("Enter amount: ");
        double amount = readDouble();

        if (amount < 0) {
            IO.println("Negative values cannot be processed !!!");
            return;
        }
        double result = 0;
        switch (choice) {
            case 1:
                result = amount * 0.092;
                printResult(amount + " SEK = " + format(result) + " USD");
                break;
            case 2:
                result = amount / 0.092;
                printResult(amount + " USD = " + format(result) + " SEK");
                break;
            case 3:
                result = amount * 0.085;
                printResult(amount + " SEK = " + format(result) + " EUR");
                break;
            case 4:
                result = amount / 0.085;
                printResult(amount + " EUR = " + format(result) + " SEK");
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
        IO.print("Enter value: ");
        double value = readDouble();
        double result = 0.0;
        switch (choice) {
            case 1:
                result = (value * 9 / 5) + 32;
                printResult(value + " °C = " + format(result) + " °F");
                break;
            case 2:
                result = (value - 32) * 5 / 9;
                printResult(value + " °F = " + format(result) + " °C");
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
        IO.print("Enter value: ");
        double value = readDouble();

        if (value < 0) {
            IO.println("Negative numbers cannot be processed");
            return;
        }

        switch (choice) {
            case 1:
                printResult(value + " m = " + format(value / 1000) + " km");
                break;
            case 2:
                printResult(value + " km = " + format(value * 1000) + " m");
                break;
            default:
                IO.println("Wrong option choosed!!!!!");
        }
    }

    static void printResult(String message) {
        IO.println("Result: " + message);
        IO.println("Converted at: " + DateTimeUtil.dateTimeValue());
    }

    static String format(double value) {
        return String.format("%.2f", value);
    }

    static int readInt() {
        while (!scanner.hasNextInt()) {
            IO.println("Invalid input. Enter number.");
            scanner.next();
        }
        return scanner.nextInt();
    }

    static double readDouble() {
        while (!scanner.hasNextDouble()) {
            IO.println("Invalid input. Enter numeric value.");
            scanner.next();
        }
        return scanner.nextDouble();
    }

//    static void validationQuestion() {
//        IO.println("Do you want to continue with Conversion?(Yes/No)");
//        boolean isRight = true;
//        while (isRight) {
//            String option = scanner.next();
//            if (option.equalsIgnoreCase("Yes")) {
//                menuCurrency();
//                int menu = scanner.nextInt();
//                value = true;
//                isRight = false;
//            } else if (option.equalsIgnoreCase("No")) {
//                value = false;
//                IO.println("Exiting , Thanks !!!!!!");
//                isRight = false;
//            } else {
//                IO.println("Wrong option entered. Please enter Yes or No");
//                isRight = true;
//            }
//        }
//    }

}
