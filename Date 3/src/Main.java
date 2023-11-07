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
        public static void stampaDataCompleta(OffsetDateTime data) {
            String dataStringa = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
            System.out.println("Data: " + dataStringa);
        }
        public static void stampaAnno(OffsetDateTime data) {
            int annoData = data.getYear();
            System.out.println("L'ANNO della data è: " + annoData);
        }
        public static void stampaMese(OffsetDateTime data) {
            String meseData = String.valueOf(data.getMonth());
            System.out.println("Il MESE della data è: " + meseData);
        }
        public static void stampaGiorno(OffsetDateTime data) {
            int giornoData = data.getDayOfMonth();
            System.out.println("Il GIORNO della data è: " + giornoData);
        }
        public static void stampaGiornoSettimana(OffsetDateTime data) {
            String giornoSettimanaData = String.valueOf(data.getDayOfWeek());
            System.out.println("Il GIORNO DELLA SETTIMANA della data è: " + giornoSettimanaData);
        }
}