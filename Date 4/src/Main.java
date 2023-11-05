//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//aggiungi un anno
//sottrai un mese
//aggiungi 7 giorni
//Stampa il risultato localizzata per l'Italia

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String dataStringa = data.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
        System.out.println("Data iniziale: " + dataStringa);
        // Aggiungi un anno
        OffsetDateTime dataUnAnnoDopo = data.plusYears(1);
        // Sottrai un mese
        OffsetDateTime dataUnMesePrima = dataUnAnnoDopo.minusMonths(1);
        // Aggiungi 7 giorni
        OffsetDateTime dataSetteGiorniDopo = dataUnMesePrima.plusDays(7);
        // Stampa il risultato localizzato per l'Italia
        String dataItalia = dataSetteGiorniDopo.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
        System.out.println("Data modificata: " +dataItalia);
    }
}