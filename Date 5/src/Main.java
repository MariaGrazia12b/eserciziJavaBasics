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

        verificaPrecedenzaPrimaData(data1, data2);
        verificaSuccessioneSecondaData(data1, data2);
        leDueDateSonoUgualiAdOra(data1, data2);

    }
    public static boolean verificaPrecedenzaPrimaData (OffsetDateTime data1, OffsetDateTime data2) {
        if (data1.isBefore(data2)) {
            System.out.println("La prima data è precedente alla seconda");
            return true;
        } else {
            System.out.println("La seconda data è precedente alla seconda");
        }
        return false;
    }
    public static boolean verificaSuccessioneSecondaData (OffsetDateTime data1, OffsetDateTime data2) {
        if (data2.isAfter(data1)) {
            System.out.println("La seconda data è successiva alla prima.");
            return true;
        } else {
            System.out.println("La seconda data non è successiva alla prima.");
        }
        return false;
    }
    public static boolean leDueDateSonoUgualiAdOra (OffsetDateTime data1, OffsetDateTime data2) {
        if (data1.isEqual(OffsetDateTime.now()) && data2.isEqual(OffsetDateTime.now())) {
            System.out.println("Le due date sono uguali alla data attuale");
            return true;
        } else {
            System.out.println("Le due date non sono uguali alla data attuale");
        }
        return false;
    }
}