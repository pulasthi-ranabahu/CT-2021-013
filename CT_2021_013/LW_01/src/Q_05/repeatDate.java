package Q_05;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class repeatDate {
    public static void main (String[]args){
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE , MMMM d ,yyyy").withLocale(Locale.ENGLISH);

        System.out.println(today.format(formatter));



    }
}
