package lexicon.workshop;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CurrencyConverter {

    public static void getConvertedCurrency(double sekValue){

        IO.println("Current conversion rate for SEK to Euro by " + DateTimeUtil.dateTimeValue() + " is ");
        IO.println("1 SEK = 0.0932 EUR");
        double euroValue = sekValue * 0.085;
        IO.println("Converted rate for  " + sekValue  + "SEK is "+euroValue+"EURO");
    }
}
