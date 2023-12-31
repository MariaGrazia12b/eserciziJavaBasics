//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//ottieni l'anno
//ottieni il mese
//ottieni il giorno
//ottieni il giorno della settimana
//Stampa i risultati sulla console

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        stampaDataCompleta(data);
        stampaAnno(data);
        stampaMese(data);
        stampaGiorno(data);
        stampaGiornoSettimana(data);
    }
        public static String stampaDataCompleta(OffsetDateTime data) {
            String dataStringa = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
            System.out.println("Data: " + dataStringa);
            return dataStringa;
        }
        public static int stampaAnno(OffsetDateTime data) {
            int annoData = data.getYear();
            System.out.println("L'ANNO della data è: " + annoData);
            return annoData;
        }
        public static String stampaMese(OffsetDateTime data) {
            String meseData = String.valueOf(data.getMonth());
            System.out.println("Il MESE della data è: " + meseData);
            return meseData;
        }
        public static int stampaGiorno(OffsetDateTime data) {
            int giornoData = data.getDayOfMonth();
            System.out.println("Il GIORNO della data è: " + giornoData);
            return giornoData;
        }
        public static String stampaGiornoSettimana(OffsetDateTime data) {
            String giornoSettimanaData = String.valueOf(data.getDayOfWeek());
            System.out.println("Il GIORNO DELLA SETTIMANA della data è: " + giornoSettimanaData);
            return giornoSettimanaData;
        }
}