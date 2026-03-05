package lexicon.workshop;

import java.util.Scanner;

public class ConverterApp {

    //Scanner class to scan the input from console
    static Scanner scan = new Scanner(System.in);

    static void main() {

        //Menu displayed in the console
        IO.println(String.format("Hello and welcome to my Converter Application !!!!!!"));
        IO.println("============== Converter App ==============");
        IO.println("1. Currency Converter");
        IO.println("2. Temperature Converter");
        IO.println("3. Length Converter");
        IO.println("4. Exit");
        IO.println("Choose an option:");

        // Get the choice of converter from the user
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                IO.println("Currency Converter");
                currencyConverter();
                break;
            case 2:
                IO.println("Temperature Converter");
                temperatureConverter();
                break;
            case 3:
                IO.println("Length Converter");
                lengthConverter();
                break;
            case 4:
                IO.println("Exiting the Converter Application, Thanks !!!!");
                break;
        }
    }

     static void currencyConverter(){
        //Currency Converter – SEK ↔ USD, SEK ↔ EUR
        IO.println("Please enter the SEK value to convert to EURO");
        double sekValue = scan.nextDouble();
        CurrencyConverter.getConvertedCurrency(sekValue);
    }

    static void temperatureConverter(){
         //Temperature Converter – Celsius ↔ Fahrenheit
         IO.println("Please enter the Celsius to convert to Fahrenheit");
         int celsiusValue = scan.nextInt();
    }

    static void lengthConverter(){
         //Length Converter – Meters ↔ Kilometers
         IO.println("Please enter the Meters to convert to Kilometers");
         long meterValue = scan.nextLong();
    }
}