//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//aggiungi un anno
//sottrai un mese
//aggiungi 7 giorni
//Stampa il risultato localizzata per l'Italia
//Crea dei test per questo esercizio

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String dataStringa = data.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
        System.out.println("Data iniziale: " + dataStringa);
        data = aggiungiAnno(data);
        data = sottraiMese(data);
        data = aggiungi7Giorni(data);
        // Stampa il risultato localizzato per l'Italia
        String dataItalia = data.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
        System.out.println("Data modificata: " + dataItalia);
    }

    public static OffsetDateTime aggiungiAnno(OffsetDateTime data1) {
        if (data1 != null) {
            try {
                data1 = data1.plusYears(1);
                return data1;
            } catch (Exception e) {
                System.out.println("Errore " + e);
            }
        }
        return null;
    }

    public static OffsetDateTime sottraiMese(OffsetDateTime data2) {
        if (data2 != null) {
            try {
                data2 = data2.minusMonths(1);
                return data2;
            } catch (Exception e) {
                System.out.println("Errore " + e);
            }
        }
        return null;
    }

    public static OffsetDateTime aggiungi7Giorni(OffsetDateTime data3) {
        if (data3 != null) {
            try {
                data3 = data3.plusDays(7);
                return data3;
            } catch (Exception e) {
                System.out.println("Errore " + e);
            }
        }
        return null;
    }
}
