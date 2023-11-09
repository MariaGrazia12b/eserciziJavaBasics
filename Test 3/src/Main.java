//Crea un oggetto OffsetDateTime da questa stringa 2023-03-01T13:00:00Z
//Formatta la data ottenendo 01 marzo 2023
//Stampa sulla console
//Crea dei test per questo esercizio

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        dataManuale("2023-03-01T13:00:00Z");

    }
    public static String dataManuale (String data) {
        if (data != null && ! data.isEmpty()) {
            try {
                OffsetDateTime data1 = OffsetDateTime.parse("2023-03-01T13:00:00Z");
                String dataStringManuale = data1.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
                System.out.println("Data formattata manualmente: " +dataStringManuale);
                return dataStringManuale;
            }catch (Exception e) {
            System.out.println("Errore nella formattazione della data: " + e.getMessage());
            return null;
        }
    } else {
        System.out.println("Stringa data vuota o nulla");
        return null;
        }
    }
}