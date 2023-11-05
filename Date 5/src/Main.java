//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//Crea un secondo oggetto data da questa stringa 2024-03-01T13:00:00Z
//verificare che la prima data è precedente alla seconda
//verificare che la seconda data è successiva alla prima
//verificare che le due date sono uguali ad ora
//Stampa il risultato

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data1 = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String data1Stringa = data1.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        System.out.println("Data 1: " +data1Stringa);

        OffsetDateTime data2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");
        String data2Stringa = data2.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        System.out.println("Data 2: " +data2Stringa);

        //verificare che la prima data è precedente alla seconda
        if (data1.isBefore(data2)) {
            System.out.println("La prima data è precedente alla seconda");
        } else {
            System.out.println("La seconda data è precedente alla seconda");
        }

        //verificare che la seconda data è successiva alla prima
        if (data2.isAfter(data1)) {
            System.out.println("La seconda data è successiva alla prima.");
        } else {
            System.out.println("La seconda data non è successiva alla prima.");
        }

        //verificare che le due date sono uguali ad ora
        if (data1.isEqual(OffsetDateTime.parse("2023-05-11T20:13:00Z")) && data2.isEqual(OffsetDateTime.parse("2023-05-11T20:13:00Z"))) {
            System.out.println("Le due date sono uguali alla data attuale");
        } else {
            System.out.println("Le due date non sono uguali alla data attuale");
        }
    }
}