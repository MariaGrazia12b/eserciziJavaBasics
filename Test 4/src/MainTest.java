import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    private final Main test = new Main();

    @Test
    public void verifica_stampa_anno () {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        int result = test.stampaAnno(data);
        assertEquals (2023, result);
    }
    @Test
    public void verifica_anno_null () {
        int result = test.stampaAnno(null);
        assertEquals (0, result);
    }
    @Test
    public void verifica_stampa_mese () {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String result = test.stampaMese(data);
        assertEquals ("MARCH", result);
    }
    @Test
    public void verifica_mese_null () {
        String result = test.stampaMese(null);
        assertEquals (null, result);
    }
    @Test
    public void verifica_stampa_giorno () {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        int result = test.stampaGiorno(data);
        assertEquals (1, result);
    }
    @Test
    public void verifica_giorno_null () {
        int result = test.stampaGiorno(null);
        assertEquals (0, result);
    }
    @Test
    public void verifica_stampa_giorno_settimana () {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String result = test.stampaGiornoSettimana(data);
        assertEquals ("WEDNESDAY", result);
    }
    @Test
    public void verifica_giorno_settimana_null () {
        String result = test.stampaGiornoSettimana(null);
        assertEquals (null, result);
    }

}