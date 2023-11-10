//Crea un oggetto OffsetDateTime da questa stringa 2023-03-01T13:00:00Z
//Formatta la data ottenendo 01 marzo 2023
//Stampa sulla console
//Crea dei test per questo esercizio

import java.time.DateTimeException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.zip.DataFormatException;

public class Main {
    public static void main(String[] args) throws DataFormatException {
        dataManuale("2023-03-01T13:00:00Z");

    }
    public static String dataManuale (String data) throws DateTimeParseException, DataFormatException {
        if (data != null && ! data.isEmpty()) {
            try {
                OffsetDateTime data1 = OffsetDateTime.parse(data);
                String dataStringManuale = data1.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
                System.out.println("Data formattata manualmente: " +dataStringManuale);
                return dataStringManuale;
            }catch (DateTimeParseException e) {
                throw new DateTimeParseException("Errore di parsing", data, e.getErrorIndex());
            }
    } else {
        System.out.println("Stringa data vuota o nulla");
        throw new DataFormatException("Stringa data vuota o nulla");
        }
    }
}