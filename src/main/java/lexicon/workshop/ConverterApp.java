package lexicon.workshop;

import java.util.Scanner;

public class ConverterApp {

    //Scanner class to scan the input from console
    static Scanner scan = new Scanner(System.in);

    static void main() {

        //Welcome message
        IO.println(String.format("Hello and welcome to my Converter Application !!!!!!"));
        IO.println("============== Converter Application ==============");
        menu();
        // Get the choice of converter from the user
        int menu = scan.nextInt();
        boolean value = true;
        while (value) {
            switch (menu) {
                case 1:
                    IO.println("============ Currency Converter ============");
                    IO.println("Currency Converter ====> SEK ↔ USD, SEK ↔ EUR");
                    ConverterImplementation.currencyConverter();
                    break;
                case 2:
                    IO.println("============ Temperature Converter ============");
                    IO.println("Temperature Converter ====> Celsius ↔ Fahrenheit");
                    ConverterImplementation.temperatureConverter();
                    break;
                case 3:
                    IO.println("============ Length Converter ============");
                    IO.println("Length Converter ====> Meters ↔ Kilometers");
                    ConverterImplementation.lengthConverter();
                    break;
                case 4:
                    IO.println("============ BMI Calculator ============");
                    IO.println("BMI Calculator – Compute BMI");
                    ConverterImplementation.bmiCalculator();
                    break;
                case 5:
                    IO.println("Exiting the Converter Application, Thanks !!!!");
                    value = false;
                    break;
                default:
                    IO.println("Wrong option entered. Please enter option in range (1,2,3,4,5). Thanks !!!!");
                    break;
            }
            //To check if the user has to proceed with conversion application or not
            IO.println("Do you want to continue with Converter App?(Yes/No)");
            boolean isRight = true;
            while (isRight) {
                String option = scan.next();
                if (option.equalsIgnoreCase("Yes")) {
                    menu();
                    menu = scan.nextInt();
                    value = true;
                    isRight = false;
                } else if (option.equalsIgnoreCase("No")) {
                    value = false;
                    IO.println("Exiting the Converter Application, Thanks !!!!!!");
                    isRight = false;
                } else {
                    IO.println("Wrong option entered. Please enter Yes or No");
                    isRight = true;
                }
            }
        }
    }

    //Menu for the conversion application
    static void menu() {
        IO.println("Choose an option (1,2,3,4,5) :");
        IO.println("1. Currency Converter");
        IO.println("2. Temperature Converter");
        IO.println("3. Length Converter");
        IO.println("4. BMI Calculator");
        IO.println("5. Exit");
    }
}