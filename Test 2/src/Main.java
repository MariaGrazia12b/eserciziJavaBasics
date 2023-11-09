//Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
//Formatta la data ottenuta in FULL, MEDIUM e SHORT
//Stampa le varie versioni


import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        dataFull("2002-03-01T13:00:00Z");
        dataMedium("2002-03-01T13:00:00Z");
        dataShort("2002-03-01T13:00:00Z");
    }
    public static String dataFull(String data) {
        if (data != null && !data.isEmpty()) {
            try {
                OffsetDateTime data1 = OffsetDateTime.parse(data);
                String dataString = data1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
                System.out.println("Formattazione Full: " + dataString);
                return dataString;
            } catch (Exception e) {
                System.out.println("Errore nella formattazione della data: " + e.getMessage());
                return null;
            }
        } else {
            System.out.println("Stringa data vuota o nulla");
            return null;
        }
    }
    public static String dataMedium (String data) {
        if (data != null && !data.isEmpty()) {
            try {
                OffsetDateTime data1 = OffsetDateTime.parse(data);
                String dataString = data1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
                System.out.println("Formattazione Medium: " + dataString);
                return dataString;
            } catch (Exception e) {
                System.out.println("Errore nella formattazione della data: " + e.getMessage());
                return null;
            }
        } else {
            System.out.println("Stringa data vuota o nulla");
            return null;
        }
    }
    public static String dataShort (String data) {
        if (data != null && !data.isEmpty()) {
            try {
                OffsetDateTime data1 = OffsetDateTime.parse(data);
                String dataString = data1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
                System.out.println("Formattazione Short: " + dataString);
                return dataString;
            } catch (Exception e) {
                System.out.println("Errore nella formattazione della data: " + e.getMessage());
                return null;
            }
        } else {
            System.out.println("Stringa data vuota o nulla");
            return null;
        }
    }

}