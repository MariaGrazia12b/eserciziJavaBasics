//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//ottieni l'anno
//ottieni il mese
//ottieni il giorno
//ottieni il giorno della settimana
//Stampa i risultati sulla console -Crea dei test per questo esercizio

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        stampaAnno("2023-03-01T13:00:00Z");
        stampaMese("2023-03-01T13:00:00Z");
        stampaGiorno("2023-03-01T13:00:00Z");
        stampaGiornoSettimana("2023-03-01T13:00:00Z");

    }
    public static int stampaAnno(String data)  {
            if (data != null) {
                try {
                    OffsetDateTime data1 = OffsetDateTime.parse(data);
                    String dataStringa = data1.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
                    int annoData = data1.getYear();
                    System.out.println("L'ANNO della data è: " + annoData);
                    return annoData;
                } catch (DateTimeParseException e) {
                    throw new DateTimeParseException("Errore di parsing", data, e.getErrorIndex());
                }
            }
        return 0;
    }
    public static String stampaMese(String data) {
        if (data != null) {
            try {
                OffsetDateTime data1 = OffsetDateTime.parse(data);
                String dataStringa = data1.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
                String meseData = String.valueOf(data1.getMonth());
                System.out.println("Il MESE della data è: " + meseData);
                return meseData;
            } catch (DateTimeParseException e) {
                throw new DateTimeParseException("Errore di parsing", data, e.getErrorIndex());
            }
        }
        return null;
    }
    public static int stampaGiorno(String data) {
        if (data != null) {
            try {
                OffsetDateTime data1 = OffsetDateTime.parse(data);
                String dataStringa = data1.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
                int giornoData = data1.getDayOfMonth();
                System.out.println("Il GIORNO della data è: " + giornoData);
                return giornoData;
            } catch (DateTimeParseException e) {
                throw new DateTimeParseException("Errore di parsing", data, e.getErrorIndex());
            }
        }
        return 0;
    }
    public static String stampaGiornoSettimana(String data) {
        if (data != null) {
            try {
                OffsetDateTime data1 = OffsetDateTime.parse(data);
                String dataStringa = data1.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
                String giornoSettimanaData = String.valueOf(data1.getDayOfWeek());
                System.out.println("Il GIORNO DELLA SETTIMANA della data è: " + giornoSettimanaData);
                return giornoSettimanaData;
            } catch (DateTimeParseException e) {
                throw new DateTimeParseException("Errore di parsing", data, e.getErrorIndex());
            }
        }
        return null;
    }
}