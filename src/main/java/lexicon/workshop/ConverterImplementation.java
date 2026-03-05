package lexicon.workshop;

public class ConverterImplementation {

    static void currencyConverter(double sekValue){
        //Currency Converter – SEK ↔ USD, SEK ↔ EUR
        IO.println("Current conversion rate for SEK to Euro by " + DateTimeUtil.dateTimeValue() + " is ");
        IO.println("1 SEK = 0.0932 EUR");
        double euroValue = sekValue * 0.085;
        IO.println("Converted rate for  " + sekValue  + " SEK is "+euroValue+" EURO");
    }

    static void temperatureConverter(int celsiusValue){
        //Temperature Converter – Celsius ↔ Fahrenheit
        IO.println("Please enter the Celsius to convert to Fahrenheit");
    }

    static void lengthConverter(long meterValue){
        //Length Converter – Meters ↔ Kilometers
        IO.println("Please enter the Meters to convert to Kilometers");
    }
}
