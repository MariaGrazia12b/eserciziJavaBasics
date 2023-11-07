//Crea un oggetto OffsetDateTime da questa stringa 2023-03-01T13:00:00Z
//Formatta la data ottenendo 01 marzo 2023
//Stampa sulla console

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        ZonedDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z").toZonedDateTime();
        System.out.println(data);
        dataLong(data);
        dataManuale(data);
    }
    //usando la formula .LONG
    public static String dataLong (ZonedDateTime data1) {
        String dataString = data1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        System.out.println("Data formattata: " +dataString);
        return dataString;
    }
    //oppure manualmente con .ofPattern, che in questo caso è più indicata perchè la consegna
    // vuole il giorno 03 e non solo 3.
    public static String dataManuale (ZonedDateTime data2) {
        String dataStringManuale = data2.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
        System.out.println("Data formattata manualmente: " +dataStringManuale);
        return dataStringManuale;
    }
}