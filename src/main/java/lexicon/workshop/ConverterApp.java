package lexicon.workshop;

import java.util.Scanner;

public class ConverterApp {
    static void main() {

        Scanner scan = new Scanner(System.in);

        IO.println(String.format("Hello and welcome to my Converter Application !!!!!!"));
        IO.println("============== Converter App ==============");
        IO.println("1. Currency Converter");
        IO.println("2. Temperature Converter");
        IO.println("3. Length Converter");
        IO.println("4. Exit");
        IO.println("Choose an option:");
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                IO.println("Currency Converter");
                break;
            case 2:
                IO.println("Temperature Converter");
                break;
            case 3:
                IO.println("Length Converter");
                break;
            case 4:
                IO.println("Exiting the Converter Application, Thanks !!!!");
                break;
        }
    }
}