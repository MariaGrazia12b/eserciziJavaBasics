//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//aggiungi un anno
//sottrai un mese
//aggiungi 7 giorni
//Stampa il risultato localizzata per l'Italia
//Crea dei test per questo esercizio

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String dataStringa = data.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
        System.out.println("Data iniziale: " + dataStringa);
        data = aggiungiAnno("2023-03-01T13:00:00Z");
        data = sottraiMese(data.toString());
        data = aggiungi7Giorni(data.toString());
        // Stampa il risultato localizzato per l'Italia
        String dataItalia = data.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
        System.out.println("Data modificata: " + dataItalia);
    }

    public static OffsetDateTime aggiungiAnno(String data1) {
        if (data1 != null) {
            try {
                OffsetDateTime data = OffsetDateTime.parse(data1);
                String dataStringa = data.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
                OffsetDateTime dataYear = data.plusYears(1);
                return dataYear;
            } catch (DateTimeParseException e) {
                throw new DateTimeParseException("Errore di parsing", data1, e.getErrorIndex());
            }
        }
        return null;
    }

    public static OffsetDateTime sottraiMese(String data2) {
        if (data2 != null) {
            try {
                OffsetDateTime data = OffsetDateTime.parse(data2);
                String dataStringa = data.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
                data = data.minusMonths(1);
                return data;
            } catch (DateTimeParseException e) {
                throw new DateTimeParseException("Errore di parsing", data2, e.getErrorIndex());
            }
        }
        return null;
    }

    public static OffsetDateTime aggiungi7Giorni(String data3) {
        if (data3 != null) {
            try {
                OffsetDateTime data = OffsetDateTime.parse(data3);
                String dataStringa = data.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
                data = data.plusDays(7);
                return data;
            } catch (DateTimeParseException e) {
                throw new DateTimeParseException("Errore di parsing", data3, e.getErrorIndex());
            }
        }
        return null;
    }
}
