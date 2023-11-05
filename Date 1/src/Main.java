//Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
//Formatta la data ottenuta in FULL, MEDIUM e SHORT
//Stampa le varie versioni

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        System.out.println(data);

        String dataString1 = data.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        System.out.println("Forma media: " +dataString1);

        String dataString2 = data.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));
        System.out.println("Forma breve: " +dataString2);

        //per formattare solo la data bastava il Full senza creare un nuovo oggetto con la formula toZoneDateTime().
        ZonedDateTime data1 = OffsetDateTime.parse("2002-03-01T13:00:00Z").toZonedDateTime();
        String dataString3 = data1.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL));
        System.out.println("Forma lunga: " +dataString3);
    }
}